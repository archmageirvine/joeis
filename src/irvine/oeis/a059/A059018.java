package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059018 Write 10*n in base 4; a(n) = sum of digits mod 4.
 * @author Sean A. Irvine
 */
public class A059018 implements Sequence {

  private long mN = -10;

  @Override
  public Z next() {
    mN += 10;
    return Z.valueOf(ZUtils.digitSum(mN, 4) & 3);
  }
}
