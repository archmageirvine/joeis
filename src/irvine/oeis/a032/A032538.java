package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032538 Quotient of 'base-3' division described in A032537.
 * @author Sean A. Irvine
 */
public class A032538 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN, 3)).divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
