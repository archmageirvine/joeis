package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A066667 Coefficient triangle of generalized Laguerre polynomials (a=1).
 * @author Georg Fischer
 */
public class A066667 extends BaseTriangle {

  /** Construct the sequence. */
  public A066667() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int m) {
    // a(n,m) = binomial(n,m)*(n+1)!/(m+1)!, n >= m> = 0.
    return Binomial.binomial(n, m).multiply(MemoryFactorial.SINGLETON.factorial(n + 1)).divide(MemoryFactorial.SINGLETON.factorial(m + 1))
      .multiply(((m & 1) == 1) ? -1 : 1);
  }
}
