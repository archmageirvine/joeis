package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073236 Pi^Pi^...^Pi (n times) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A073236 extends Sequence0 {

  private CR mA = null;

  @Override
  public Z next() {
    mA = mA == null ? CR.ONE : CR.PI.pow(mA);
    return mA.floor();
  }
}
