package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393334 Number of unlabeled rooted trees with n nodes whose level sizes are strictly decreasing away from the root, excluding the root level.
 * @author Sean A. Irvine
 */
public class A393334 extends Sequence1 {

  // After Robert P. P. McKone

  // At around n=60 the long keys for the maps might become unreliable

  private Z[] mPrecomputed = compute(1);
  private int mN = -1;

  /** Compute maximum height for strictly decreasing sequences. */
  private int maxHeight(final int n) {
    int h = 0;
    while ((h + 1) * (h + 2) / 2 <= n - 1) {
      ++h;
    }
    return h;
  }

  private List<Map<Long, Z>> createListOfMaps(final long n) {
    final List<Map<Long, Z>> d = new ArrayList<>();
    for (int i = 0; i <= n; ++i) {
      d.add(new HashMap<>());
    }
    d.get(0).put(0L, Z.ONE);
    return d;
  }

  private Z[] compute(final int n) {
    if (n <= 1) {
      return new Z[] {Z.ONE};
    }
    final int nTail = n - 1;

    List<Map<Long, Z>> dPrev = createListOfMaps(nTail);

    final int hMax = maxHeight(n);
    for (int h = 1; h <= hMax; ++h) {
      final List<Map<Long, Z>> d = createListOfMaps(nTail);
      for (int sU = 0; sU <= nTail; ++sU) {
        final Map<Long, Z> bucket = dPrev.get(sU);
        if (bucket.isEmpty()) {
          continue;
        }
        final int size = 1 + sU;
        if (size > nTail) {
          continue;
        }
        final int kmaxGlobal = nTail / size;
        for (final Map.Entry<Long, Z> entry : bucket.entrySet()) {
          final long codeU = entry.getKey();
          final Z c = entry.getValue();

          final Z[] coeffs;
          if (!c.equals(Z.ONE)) {
            coeffs = new Z[kmaxGlobal + 1];
            coeffs[0] = Z.ONE;
            Z ck = Z.ONE;
            for (int k = 1; k <= kmaxGlobal; ++k) {
              ck = ck.multiply(c.add(k - 1)).divide(k);
              coeffs[k] = ck;
            }
          } else {
            coeffs = null;
          }

          final int maxSourceSum = nTail - size;
          for (int s = maxSourceSum; s >= 0; --s) {
            final Map<Long, Z> src = d.get(s);
            final int maxk = (nTail - s) / size;
            if (maxk == 0) {
              continue;
            }

            if (coeffs == null) {
              for (final Map.Entry<Long, Z> e : src.entrySet()) {
                final long code = e.getKey();
                final Z coeff = e.getValue();
                int ns = s + size;
                long ncode = code + 1 + codeU * n;
                for (int t = 0; t < maxk; t++) {
                  final Map<Long, Z> dest = d.get(ns);
                  dest.put(ncode, dest.getOrDefault(ncode, Z.ZERO).add(coeff));
                  ns += size;
                  ncode += 1 + codeU * n;
                }
              }
            } else {
              for (final Map.Entry<Long, Z> e : src.entrySet()) {
                final long code = e.getKey();
                final Z coeff = e.getValue();
                int ns = s + size;
                long ncode = code + 1 + codeU * n;
                for (int k = 1; k <= maxk; ++k) {
                  final Z add = coeffs[k];
                  if (!add.isZero()) {
                    final Map<Long, Z> dest = d.get(ns);
                    dest.put(ncode, dest.getOrDefault(ncode, Z.ZERO).add(coeff.multiply(add)));
                  }
                  ns += size;
                  ncode += 1 + codeU * n;
                }
              }
            }
          }
        }
      }
      dPrev = d;
    }

    // Sum valid codes
    final Z[] result = new Z[n];
    Arrays.fill(result, Z.ZERO);
    for (int s = 0; s <= nTail; ++s) {
      final Map<Long, Z> bucket = dPrev.get(s);
      if (bucket.isEmpty()) {
        continue;
      }
      final int nn = 1 + s;
      if (nn > n) {
        continue;
      }
      if (s == 0) {
        result[0] = result[0].add(bucket.getOrDefault(0L, Z.ZERO));
        continue;
      }
      for (final Map.Entry<Long, Z> e : bucket.entrySet()) {
        final long code = e.getKey();
        final Z count = e.getValue();
        long tmp = code;
        long prev = n;
        boolean ok = true;
        while (tmp != 0) {
          final long d = tmp % n;
          if (d >= prev) {
            ok = false;
            break;
          }
          prev = d;
          tmp /= n;
        }
        if (ok) {
          result[nn - 1] = result[nn - 1].add(count);
        }
      }
    }
    return result;
  }

  @Override
  public Z next() {
    if (++mN >= mPrecomputed.length) {
      mPrecomputed = compute(mN + 5); // Avoid recomputing too often
      //System.out.println(Arrays.toString(mPrecomputed));
    }
    return mPrecomputed[mN];
  }
}
