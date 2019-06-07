package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007968 Type of happy factorization of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007968 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long s = LongUtils.sqrt(mN);
    if (s * s == mN) {
      return Z.ZERO;
    }
    final Z[] divisors = Cheetah.factor(mN).divisors();
    for (long r = 1; ; ++r) {
      for (final Z b : divisors) {
        final Z c = Z.valueOf(mN / b.longValue());
        final Z br2 = b.multiply(r * r);
        final Z br2p1 = br2.add(1);
        final Z[] qr1 = br2p1.divideAndRemainder(c);
        if (Z.ZERO.equals(qr1[1]) && Z.ZERO.equals(qr1[0].sqrtAndRemainder()[1])) {
          return Z.ONE;
        }
        final Z br2p2 = br2.add(2);
        final Z[] qr2 = br2p2.divideAndRemainder(c);
        if (Z.ZERO.equals(qr2[1]) && Z.ZERO.equals(qr2[0].sqrtAndRemainder()[1])) {
          return Z.TWO;
        }
      }
    }
  }
}
