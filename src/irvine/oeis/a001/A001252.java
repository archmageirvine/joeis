package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a211.A211318;

/**
 * A001252 Number of permutations of order n with the length of longest run equal to 4.
 * @author Sean A. Irvine
 */
public class A001252 extends A211318 {

  private int mN = 1;

  @Override
  public Z next() {
    return a(mN++, 4);
  }

}
