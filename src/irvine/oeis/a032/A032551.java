package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032551 Numbers that, when expressed in base 8 and then interpreted in base 10, yield a multiple of the original number.
 * @author Sean A. Irvine
 */
public class A032551 implements Sequence {

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
