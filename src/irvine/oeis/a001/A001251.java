package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a211.A211318;

/**
 * A001251 Number of permutations of order n with the length of longest run equal to 3.
 * @author Sean A. Irvine
 */
public class A001251 extends A211318 {

  private int mN = 1;

  @Override
  public Z next() {
    return a(mN++, 3);
  }

}
