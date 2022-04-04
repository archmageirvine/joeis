package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062137 Coefficient triangle of generalized Laguerre polynomials n!*L(n,3,x) (rising powers of x).
 * <code>a(n, m) = ((-1)^m)*n!*binomial(n+3, n-m)/m!</code>.
 * @author Georg Fischer
 */
public class A062137 extends Triangle {

  private final int mParm;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A062137() {
    this(3);
  }

  /**
   * Generic constructor with parameter.
   * @param parm parameter in <code>L(n, parm, x)</code>
   */
  public A062137(final int parm) {
    mParm = parm;
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int m) {
    return n == 0 ? Z.ONE : FACTORIAL.factorial(n)
      .multiply(Binomial.binomial(n + mParm, n - m))
      .divide(FACTORIAL.factorial(m))
      .multiply(((m & 1) == 0) ? 1 : -1);
  }
}
