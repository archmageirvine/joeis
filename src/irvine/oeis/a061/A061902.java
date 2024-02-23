package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A061902 Number of digits in n-th term of A061482.
 * @author Sean A. Irvine
 */
public class A061902 extends A061482 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log10().ceil().max(Z.ONE);
    //return Z.valueOf(super.next().toString().length());
  }
}
