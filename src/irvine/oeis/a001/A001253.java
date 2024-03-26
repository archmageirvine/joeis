package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a211.A211318;

/**
 * A001253 Number of permutations of order n with the length of longest run equal to 5.
 * @author Sean A. Irvine
 */
public class A001253 extends A211318 {

  private int mN = 1;

  @Override
  public Z next() {
    return a(mN++, 5);
  }

}
