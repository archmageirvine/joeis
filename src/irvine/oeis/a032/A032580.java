package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032580 Quotient of 'base-24' division described in A032579.
 * @author Sean A. Irvine
 */
public class A032580 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN), 24).divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
