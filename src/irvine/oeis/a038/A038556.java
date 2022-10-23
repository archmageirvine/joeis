package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038556 Periodic derivative of n.
 * @author Sean A. Irvine
 */
public class A038556 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ LongUtils.rotateLeft(mN));
  }
}
