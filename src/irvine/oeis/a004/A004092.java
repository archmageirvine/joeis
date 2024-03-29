package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A004092 Sum of digits of even numbers.
 * @author Sean A. Irvine
 */
public class A004092 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(ZUtils.digitSum(mN));
  }
}

