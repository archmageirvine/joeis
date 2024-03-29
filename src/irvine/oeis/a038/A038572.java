package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038572 a(n) = n rotated one binary place to the right.
 * @author Sean A. Irvine
 */
public class A038572 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.rotateRight(++mN));
  }
}
