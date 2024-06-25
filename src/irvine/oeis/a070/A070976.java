package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A070976 Number of steps to reach 1 in '3x+1' (or Collatz) problem starting with 3^n.
 * @author Sean A. Irvine
 */
public class A070976 extends A006577 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return a(mA);
  }
}
