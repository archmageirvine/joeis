package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032533 Numbers that, when expressed in base 2 and then interpreted in base 10, yield a multiple of the original number.
 * @author Sean A. Irvine
 */
public class A032533 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN, 2)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
