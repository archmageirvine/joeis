package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062873 Nearest integer to arithmetic mean of n! and n^n.
 * @author Sean A. Irvine
 */
public class A062873 extends A000142 {

  @Override
  public Z next() {
    return super.next().add(Z.valueOf(mN).pow(mN)).add(1).divide2();
  }
}
