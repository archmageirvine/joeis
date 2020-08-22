package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032550 Quotient of 'base-7' division described in A032549.
 * @author Sean A. Irvine
 */
public class A032550 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN, 7)).divideAndRemainder(Z.valueOf(mN));
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
