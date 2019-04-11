package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004164 Sum of digits of <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A004164 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(Z.valueOf(++mN).pow(3)));
  }
}
