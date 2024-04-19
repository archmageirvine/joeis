package irvine.oeis.a232;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A232788 A232773(n) / A006882(n): Permanent of the n X n matrix with elements [1,2,...,n^2], divided by n!!.
 * @author Georg Fischer
 */
public class A232788 extends A232773 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(Functions.MULTIFACTORIAL.z(mN));
  }
}
