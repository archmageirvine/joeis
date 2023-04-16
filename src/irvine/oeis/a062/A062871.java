package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062871 a(n) is the integer part of the geometric mean of n! and n^n.
 * @author Sean A. Irvine
 */
public class A062871 extends A000142 {

  @Override
  public Z next() {
    return super.next().multiply(Z.valueOf(mN).pow(mN)).sqrt();
  }
}
