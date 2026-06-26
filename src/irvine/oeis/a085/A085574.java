package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085574 Least k such that n*(n+1)*(n+2) + k is palindromic.
 * @author Sean A. Irvine
 */
public class A085574 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2);
    return Functions.NEXT_PALINDROME.z(t).subtract(t);
  }
}
