package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032576 Quotient of 'base-22' division described in A032575.
 * @author Sean A. Irvine
 */
public class A032576 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN), 22).divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
