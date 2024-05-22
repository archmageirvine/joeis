package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import irvine.math.function.Functions;
import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A067210 Number of n X n 0..2 matrices with all row and column sums equal.
 * @author Sean A. Irvine
 */
public class A067210 extends AbstractSequence {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int mL;
  private int mN;

  /**
   * Construct with given offset and maximum element.
   * @param offset offset
   * @param maxElement maximum element
   */
  public A067210(final int offset, final int maxElement) {
    super(offset);
    mL = maxElement;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A067210() {
    this(1, 2);
  }

  private void combine(final Map<List<Integer>, Z> res, final List<Integer> a, final Z v, final List<Integer> b, final int min, final int max) {
    for (int k = 0; k < a.size(); ++k) {
      final int c = a.get(k) + b.get(k);
      if (c > max || c < min) {
        return;
      }
    }
    final ArrayList<Integer> lst = new ArrayList<>();
    for (int k = 0; k < a.size(); ++k) {
      lst.add(a.get(k) + b.get(k));
    }
    Collections.sort(lst);
    res.merge(lst, v, Z::add);
  }

  private void combineList(final Map<List<Integer>, Z> res, final List<Integer> a, final Z v, final List<List<Integer>> b, final int min, final int max) {
    final Map<List<Integer>, Z> myRes = new HashMap<>();
    for (final List<Integer> t : b) {
      combine(myRes, a, v, t, min, max);
    }
    synchronized (res) {
      for (final Map.Entry<List<Integer>, Z> e : myRes.entrySet()) {
        res.merge(e.getKey(), e.getValue(), Z::add);
      }
    }
  }

  private Map<List<Integer>, Z> combineList(final Map<List<Integer>, Z> a, final List<List<Integer>> b, final int min, final int max) {
    final Map<List<Integer>, Z> res = new HashMap<>();
    final ForkJoinPool myPool = new ForkJoinPool(THREADS);
    try {
      myPool.submit(() -> a.entrySet().parallelStream().forEach(e -> combineList(res, e.getKey(), e.getValue(), b, min, max))).get();
    } catch (InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
    return res;
  }

  private List<List<Integer>> getCompositions(final int n, final int k) {
    final List<List<Integer>> c = new ArrayList<>();
    final FixedLengthPartition part = new FixedLengthPartition(k, n, 0, mL);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] q;
      while ((q = perm.next()) != null) {
        final ArrayList<Integer> lst = new ArrayList<>();
        for (final int v : q) {
          lst.add(v);
        }
        c.add(lst);
      }
    }
    return c;
  }

  private Z t(final int n, final int k) {
    final List<List<Integer>> c = getCompositions(n, k);
    final List<Integer> e = new ArrayList<>();
    for (int j = 0; j < n; ++j) {
      e.add(0);
    }
    Map<List<Integer>, Z> cnts = Collections.singletonMap(e, Z.ONE);
    for (int r = 0; r < n; ++r) {
      if (mVerbose) {
        StringUtils.message("t(" + n + "," + k + ") starting iteration " + (r + 1) + "/" + n + " on " + cnts.size() + " cases");
      }
      final int lo = k - (n - r) * mL;
      cnts = combineList(cnts, c, lo, k);
    }
    assert cnts.size() == 1;
    return Functions.SUM.z(cnts.values());
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    // / 2 exploits symmetry
    for (int k = 0; k <= mL * mN / 2; ++k) {
      final Z t = t(mN, k);
      sum = sum.add(2 * k == mL * mN ? t : t.multiply2());
    }
    return sum;
  }
}
