package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083378 a(n) is the largest integer whose cube has n digits and first digit 1, except that a(2)=2.
 * @author Sean A. Irvine
 */
public class A083378 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(10);
    return mA.root(3);
  }
}
