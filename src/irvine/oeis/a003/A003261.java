package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003261.
 * @author Sean A. Irvine
 */
public class A003261 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN).subtract(1);
  }

}
