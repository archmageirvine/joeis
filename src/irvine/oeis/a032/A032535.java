package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032535 Odd numbers that, when expressed in base 2 and then interpreted in base 10, yield a multiple of the original number.
 * @author Sean A. Irvine
 */
public class A032535 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (new Z(Long.toString(mN, 2)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
