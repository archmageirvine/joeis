package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000312;

/**
 * A066588 The sum of the digits of n^n.
 * @author Sean A. Irvine
 */
public class A066588 extends A000312 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
