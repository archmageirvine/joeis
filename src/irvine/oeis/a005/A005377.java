package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005377 Number of low discrepancy sequences in base 4.
 * @author Sean A. Irvine
 */
public class A005377 extends A005356 {

  @Override
  protected Z power(final int d) {
    return Z.FOUR.pow(d);
  }
}
