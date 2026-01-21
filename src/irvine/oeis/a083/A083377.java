package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083377 a(n) = the largest integer whose square has n digits and first digit 1.
 * @author Sean A. Irvine
 */
public class A083377 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(10);
    return mA.sqrt();
  }
}
