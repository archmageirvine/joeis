package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052036 Smallest number that must be added to n to make or keep n palindromic.
 * @author Sean A. Irvine
 */
public class A052036 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.NEXT_PALINDROME.z(++mN).subtract(mN);
  }
}
