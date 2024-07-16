package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071354 Floor(2^n/n) is odd.
 * @author Sean A. Irvine
 */
public class A071354 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).divide(mN).isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
