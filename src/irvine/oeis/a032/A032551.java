package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032551 Numbers that, when expressed in base 8 and then interpreted in base 10, yield a multiple of the original number.
 * @author Sean A. Irvine
 */
public class A032551 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0 || new Z(Long.toString(mN, 8)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
