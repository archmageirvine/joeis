package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032572 Quotient of 'base-20' division described in A032571.
 * @author Sean A. Irvine
 */
public class A032572 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN), 20).divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
