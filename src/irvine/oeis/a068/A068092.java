package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068092 Index of smallest triangular number with n digits.
 * @author Sean A. Irvine
 */
public class A068092 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(10);
    return CR.valueOf(mA).sqrt().round();
  }
}

