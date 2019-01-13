package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004165.
 * @author Sean A. Irvine
 */
public class A004165 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ZUtils.reverse(Z.valueOf(++mN).pow(3));
  }
}
