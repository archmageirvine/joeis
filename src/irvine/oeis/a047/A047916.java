package irvine.oeis.a047;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047916 Triangular array read by rows: a(n,k) = phi(n/k)*(n/k)^k*k! if k|n else 0 (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047916 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return n % m == 0
      ? mF.factorial(m).multiply(Euler.phiAsLong(n / m)).multiply(Z.valueOf(n / m).pow(m))
      : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
