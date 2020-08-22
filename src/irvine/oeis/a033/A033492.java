package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a006.A006878;

/**
 * A033492 Record number of steps to reach 1 in '3x+1' problem, corresponding to starting values in A006877 (same as A006878 except here we start counting at 1 instead of 0).
 * @author Sean A. Irvine
 */
public class A033492 extends A006878 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
