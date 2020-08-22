package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032552 Quotient of 'base-8' division described in A032551.
 * @author Sean A. Irvine
 */
public class A032552 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE; // Convention for 0/0
    }
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN, 8)).divideAndRemainder(Z.valueOf(mN));
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
