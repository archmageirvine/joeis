package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083441 Largest n-digit palindrome with a digit sum of n.
 * @author Sean A. Irvine
 */
public class A083441 extends Sequence1 {

  // After Andrew Howroyd

  private int mN = 0;

  @Override
  public Z next() {
    final int h = ++mN / 2;
    final int w = h / 9 + 1;
    final Z q = Z.TEN.pow(w).subtract(10 - h % 9);
    return Z.TEN.pow(mN - w).multiply(q).add(Z.TEN.pow(h).multiply(mN & 1)).add(Functions.REVERSE.z(q));
  }
}
