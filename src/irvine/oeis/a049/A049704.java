package irvine.oeis.a049;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049704 Array T read by antidiagonals; T(i,j)=number of nonnegative slopes of lines determined by two points in the triangular set {(x,y): 0&lt;=x&lt;=i, 0&lt;=y&lt;=j-j*x/i} of lattice points.
 * @author Sean A. Irvine
 */
public class A049704 extends AbstractSequence {

  /** Construct the sequence. */
  public A049704() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  protected int t(final long n, final long m) {
    if (n <= 1) {
      return n == 0 && m == 0 ? 0 : 1;
    }
    if (m <= 1) {
      return 1;
    }
    final HashSet<Q> slopes = new HashSet<>();
    for (long k = 0; k <= n; ++k) {
      for (long j = 0; j <= (n * m - m * k) / n; ++j) {
        for (long s = k + 1; s <= n; ++s) {
          for (long t = j + 1; t <= (n * m - m * s) / n; ++t) {
            slopes.add(new Q(s - k, t - j));
          }
        }
      }
    }
    return slopes.size() + 1; // + 1 for horizontal
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}
