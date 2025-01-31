package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005148;

/**
 * A074774 a(n) = A005148(n)/8^(b(n)-1) where b(n) denotes the number of 1's in the binary representation of n.
 * @author Sean A. Irvine
 */
public class A074774 extends Sequence1 {

  private final Sequence mA = new A005148().skip();
  private long mN = 0;

  @Override
  public Z next() {
    final Z b = Z.ONE.shiftLeft(3 * (Long.bitCount(++mN) - 1));
    final Z t = mA.next();
    final Z[] qr = t.divideAndRemainder(b);
    if (!qr[1].isZero()) {
      throw new UnsupportedOperationException("Non-integer value at " + mN);
    }
    return qr[0];
  }
}
