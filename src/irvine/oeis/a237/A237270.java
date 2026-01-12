package irvine.oeis.a237;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A237270 Triangle read by rows in which row n lists the parts of the symmetric representation of sigma(n).
 * @author Sean A. Irvine
 */
public class A237270 extends Sequence1 {

  // After Hartmut F. W. Hoft

  private static final long[] C10 = {1, 0};
  private static final long[] C0N1 = {0, -1};
  private int mN = 0;
  private final LinkedList<Z> mA = new LinkedList<>();

  private static long t(final long n, final long k) {
    return (2 * n + 1 - k * k + k) / (2 * k);
  }

  private static List<long[]> path(final int n) {
    final int c = Functions.TRINV.i(n);
    final long[] h = new long[c];
    for (int k = 0; k < c; ++k) {
      h[k] = t(n, k + 1) - t(n, k + 2);
    }

    final List<Long> r = new ArrayList<>();
    for (final long value : h) {
      r.add(value);
    }
    for (int k = h.length - 1; k >= 0; --k) {
      r.add(h[k]);
    }

    final List<long[]> d = new ArrayList<>();
    for (int k = 0; k < c; ++k) {
      d.add(C10);
      d.add(C0N1);
    }

    final List<long[]> rd = new ArrayList<>();
    for (int k = 0; k < 2 * c; ++k) {
      rd.add(new long[]{r.get(k), d.get(k)[0], d.get(k)[1]});
    }

    final List<long[]> p = new ArrayList<>();
    p.add(new long[]{0, n});

    for (final long[] t : rd) {
      final long steps = t[0];
      final long dx = t[1];
      final long dy = t[2];
      final long[] last = p.get(p.size() - 1);
      for (int j = 1; j <= steps; ++j) {
        p.add(new long[] {last[0] + j * dx, last[1] + j * dy});
      }
    }
    return p;
  }

  private static List<List<Long>> segments(final int n) {
    final List<long[]> pN = path(n);
    final List<long[]> pN1 = path(n - 1);
    // Drop first and last of path[n]
    final List<long[]> interior = pN.subList(1, pN.size() - 1);
    // Align with path[n - 1]
    final int limit = Math.min(interior.size(), pN1.size());
    final List<Long> deltas = new ArrayList<>();
    for (int k = 0; k < limit; ++k) {
      final long dx = interior.get(k)[0] - pN1.get(k)[0];
      final long dy = interior.get(k)[1] - pN1.get(k)[1];
      deltas.add(Math.max(Math.min(dx, dy), 0));
    }
    final List<List<Long>> segments = new ArrayList<>();
    List<Long> current = new ArrayList<>();
    for (final long v : deltas) {
      if (v == 0) {
        if (!current.isEmpty()) {
          segments.add(current);
          current = new ArrayList<>();
        }
      } else {
        current.add(v);
      }
    }
    if (!current.isEmpty()) {
      segments.add(current);
    }
    return segments;
  }

  /**
   * Compute the symmetric representation of sigma.
   * Also called partSRS.
   * @param n value
   * @return list of parts
   */
  public static ArrayList<Z> symmetricRepresentationSigma(final int n) {
    final ArrayList<Z> res = new ArrayList<>();
    for (final List<Long> seg : segments(n)) {
      long sum = 0;
      for (final long v : seg) {
        sum += v;
      }
      if (sum != 0) {
        res.add(Z.valueOf(sum));
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.addAll(symmetricRepresentationSigma(++mN));
    }
    return mA.pollFirst();
  }
}

