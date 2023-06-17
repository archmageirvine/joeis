package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007968 Type of happy factorization of n.
 * @author Sean A. Irvine
 */
public class A007968 extends AbstractSequence {

  /* Construct the sequence. */
  public A007968() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long s = LongUtils.sqrt(mN);
    if (s * s == mN) {
      return Z.ZERO;
    }
    final Z[] divisors = Jaguar.factor(mN).divisors();
    for (long r = 1; ; ++r) {
      for (final Z b : divisors) {
        final Z c = Z.valueOf(mN / b.longValue());
        final Z br2 = b.multiply(r * r);
        final Z br2p1 = br2.add(1);
        final Z[] qr1 = br2p1.divideAndRemainder(c);
        if (qr1[1].isZero() && qr1[0].isSquare()) {
          return Z.ONE;
        }
        final Z br2p2 = br2.add(2);
        final Z[] qr2 = br2p2.divideAndRemainder(c);
        if (qr2[1].isZero() && qr2[0].isSquare()) {
          return Z.TWO;
        }
      }
    }
  }
}
