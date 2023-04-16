package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062874 Integer part of arithmetic mean of n! and n^n.
 * @author Sean A. Irvine
 */
public class A062874 extends A000142 {

  @Override
  public Z next() {
    return super.next().add(Z.valueOf(mN).pow(mN)).divide2();
  }
}
