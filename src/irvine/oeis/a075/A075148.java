package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075148 Table E(n,k) (listed antidiagonalwise as E(0,0), E(1,0), E(0,1), E(2,0), E(1,1), E(0,2), ...) where E(n,k) is F(n+k) for all even n and L(n+k) for all odd n. F(n) and L(n) are the n-th Fibonacci (A000045) and Lucas (A000032) numbers respectively.
 * @author Sean A. Irvine
 */
public class A075148 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    return (n & 1) == 0 ? Functions.FIBONACCI.z(n + k) : Functions.LUCAS.z(n + k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
