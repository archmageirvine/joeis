package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062872 Nearest integer to geometric mean of n! and n^n.
 * @author Sean A. Irvine
 */
public class A062872 extends A000142 {

  @Override
  public Z next() {
    return CR.valueOf(super.next().multiply(Z.valueOf(mN).pow(mN))).sqrt().round();
  }
}
