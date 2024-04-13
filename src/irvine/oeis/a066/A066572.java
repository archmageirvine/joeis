package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;
import irvine.util.Permutation;

/**
 * A066572 Number of sets of distinct positive integers with geometric mean n.
 * @author Sean A. Irvine
 */
public class A066572 extends Sequence1 {

  // After Martin Fuller
  // see https://oeis.org/A066572/a066572.txt

  private long mN = 0;
  private final HashMap<String, Z> mB = new HashMap<>();

  private Z get(final int[] sig) {
    Arrays.sort(sig);
    final String key = key(sig);
    final Z res = mB.get(key);
    if (res != null) {
      return res;
    }
    final Z r = compute(sig);
    mB.put(key, r);
    return r;
  }

  private boolean hasRepeatedValues(final int[] sig) {
    for (int k = 1; k < sig.length; ++k) {
      if (sig[k - 1] == sig[k]) {
        return true;
      }
    }
    return false;
  }

  private int[] negate(final int[] a) {
    final int[] r = new int[a.length];
    for (int k = 0; k < a.length; ++k) {
      r[k] = -a[k];
    }
    return r;
  }

  private String key(final int[] k) {
    return Arrays.toString(k);
  }

  private HashSet<Integer> toSet(final int[] a) {
    final HashSet<Integer> t = new HashSet<>(a.length);
    for (final int v : a) {
      t.add(v);
    }
    return t;
  }

  private List<Integer> toList(final int[] a) {
    final List<Integer> k = new ArrayList<>(a.length);
    for (final int v : a) {
      k.add(v);
    }
    return k;
  }

  private void increment(final HashMap<List<Integer>, Z> set, final List<Integer> key, final Z value) {
    if (value == null) {
      return;
    }
    set.merge(key, value, Z::add);
  }

  private void increment(final HashMap<List<Integer>, Z> set, final int[] key, final Z value) {
    increment(set, toList(key), value);
  }

  private Z compute(final int[] sig) {
    final int b = (int) IntegerUtils.sum(sig);
    final int c = sig.length;
    final int limit = Binomial.binomial(b + c, c + 1).intValueExact();
    final boolean hasRepeatedValue = hasRepeatedValues(sig);
    final List<Integer> tuple0 = new ArrayList<>();
    for (int k = 0; k < c; ++k) {
      tuple0.add(0);
    }
    final List<HashMap<List<Integer>, Z>> partialSums = new ArrayList<>();
    for (int k = 0; k <= limit; ++k) {
      partialSums.add(new HashMap<>());
    }
    for (int rs = -b; rs <= limit; ++rs) {
      final FixedLengthPartition part = new FixedLengthPartition(rs + b, c, 0);
      int[] y;
      while ((y = part.next()) != null) {
        final Permutation perm = new Permutation(y);
        int[] x;
        while ((x = perm.next()) != null) {
          final int[] r = new int[x.length];
          for (int k = 0; k < x.length; ++k) {
            r[k] = x[k] - sig[k];
          }
          if (rs > 0) {
            increment(partialSums.get(0), tuple0, partialSums.get(rs).get(toList(negate(r))));
          }
          for (int i = 0; i <= limit - Math.max(-rs, rs * 2); ++i) {
            final HashMap<List<Integer>, Z> target;
            final HashMap<List<Integer>, Z> source;
            if (rs < 0) {
              target = partialSums.get(limit - i);
              source = partialSums.get(limit - i + rs);
            } else if (rs == 0) {
              target = partialSums.get(i);
              source = new HashMap<>(target);
            } else {
              target = partialSums.get(i + rs);
              source = partialSums.get(i + rs * 2);
            }
            for (final Map.Entry<List<Integer>, Z> e : source.entrySet()) {
              final List<Integer> ps = e.getKey();
              final Z m = e.getValue();
              final int[] u = new int[ps.size()];
              for (int j = 0; j < c; ++j) {
                u[j] = ps.get(j) + r[j];
              }
              increment(target, u, m);
            }
          }
          if (rs <= 0) {
            increment(partialSums.get(-rs), r, Z.ONE);
          }
        }
        if (hasRepeatedValue && toSet(y).size() >= 2) {
          // This entire is block is mainly about memory efficiency.
          // It can be disabled without affecting results
          for (int j = Math.abs(rs); j <= limit - Math.max(rs, 0); ++j) {
            // Find tuples that are unsorted where sig has repeats
            final HashMap<List<Integer>, Z> counter = partialSums.get(j);
            final HashMap<List<Integer>, Z> toSort = new HashMap<>();
            for (final Map.Entry<List<Integer>, Z> e : counter.entrySet()) {
              final List<Integer> ps = e.getKey();
              for (int k = 0; k < c - 1; ++k) {
                if (ps.get(k) > ps.get(k + 1) && sig[k] == sig[k + 1]) {
                  toSort.put(ps, e.getValue());
                  break;
                }
              }
            }
            for (final Map.Entry<List<Integer>, Z> e : toSort.entrySet()) {
              // Remove the unsorted tuple and add the sorted version
              final List<Integer> ps = e.getKey();
              counter.remove(ps);
              final List<Pair<Integer, Integer>> lst = new ArrayList<>() ;
              for (int l = 0; l < c; ++l) {
                lst.add(new Pair<>(sig[l], ps.get(l)));
              }
              lst.sort(Comparator.comparingInt((ToIntFunction<Pair<Integer, Integer>>) Pair::left).thenComparingInt(Pair::right));
              final ArrayList<Integer> ps2 = new ArrayList<>(c);
              for (final Pair<Integer, Integer> u : lst) {
                ps2.add(u.right());
              }
              increment(counter, ps2, e.getValue());
            }
          }
        }
      }
      if (rs == 0) {
        final HashMap<List<Integer>, Z> cnt = new HashMap<>();
        increment(cnt, tuple0, partialSums.get(0).get(tuple0));
        partialSums.set(0, cnt);
      } else if (rs > 0) {
        partialSums.set(rs, null);
      }
    }
    return partialSums.get(0).get(tuple0);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final int[] signature = new int[fs.omega()];
    int k = 0;
    for (final Z p : fs.toZArray()) {
      signature[k++] = fs.getExponent(p);
    }
    return get(signature);
  }
}

