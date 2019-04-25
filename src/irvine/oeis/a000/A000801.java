package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000801 <code>Sum_{k = 1..n} floor(2^k / k)</code>.
 * @author Sean A. Irvine
 */
public class A000801 extends A000799 {

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(super.next());
    return mS;
  }
}
