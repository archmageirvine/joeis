package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066914 Integers of the form (2^(n^3)+1)/(2^(n^2)+1).
 * @author Sean A. Irvine
 */
public class A066914 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = Z.ONE.shiftLeft(mN * mN * mN).add(1);
      final Z b = Z.ONE.shiftLeft(mN * mN).add(1);
      final Z[] qr = a.divideAndRemainder(b);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
