package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072346 Volume of n-dimensional sphere of radius r is V_n*r^n = Pi^(n/2)*r^n/(n/2)! = C_n*Pi^floor(n/2)*r^n; sequence gives denominator of C_n.
 * @author Sean A. Irvine
 */
public class A072346 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Functions.FACTORIAL.z(mN / 2) : Functions.MULTIFACTORIAL.z(mN);
  }
}
