package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a078.A078567;

/**
 * A051336 Number of arithmetic progressions in {1,2,3,...,n}, including trivial arithmetic progressions of lengths 1 and 2.
 * @author Sean A. Irvine
 */
public class A051336 extends A078567 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
