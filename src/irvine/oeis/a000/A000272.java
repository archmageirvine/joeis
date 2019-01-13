package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000272.
 * @author Sean A. Irvine
 */
public class A000272 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    } else {
      return Z.valueOf(mN).pow(mN - 2);
    }
  }
}
