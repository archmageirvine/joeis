package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046794 Geometric and harmonic means of A046795(n) and a(n) both integers.
 * @author Sean A. Irvine
 */
public class A046794 extends Sequence1 {

  private long mN = 19;

  protected Z select(final long n, final long k) {
    return Z.valueOf(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Q nr = new Q(1, ++mN);
      for (long k = 1; k < mN; ++k) {
        final long t = k * mN;
        final long s = Functions.SQRT.l(t);
        if (s * s == t && nr.add(new Q(1, k)).num().compareTo(Z.TWO) <= 0) {
          return select(mN, k);
        }
      }
    }
  }
}

