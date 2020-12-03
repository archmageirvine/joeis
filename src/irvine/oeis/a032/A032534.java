package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032534 Quotient of 'base-2' division described in A032533.
 * @author Sean A. Irvine
 */
public class A032534 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN, 2)).divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
