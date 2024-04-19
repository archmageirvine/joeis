package irvine.oeis.a113;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A113550 a(n) = product of n successive numbers up to n, if n is odd a(n) = n*(n-1)*.. = n!,if n is even a(n) = n(n+1)(n+2)... 'n' terms.
 * @author Georg Fischer
 */
public class A113550 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(1) = 1, a(2n-1) = (2n-1)!, a(2n) = (4n-1)!/(2n-1)!.
    ++mN;
    return mN == 1 ? Z.ONE : (((mN & 1) == 1) ? Functions.FACTORIAL.z(mN)
      : Functions.FACTORIAL.z(2 * mN - 1).divide(Functions.FACTORIAL.z(mN - 1)));
  }
}
