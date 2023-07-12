package irvine.oeis.a322;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A322127 Triangular array, read by rows: T(n,k) = numerator of binomial(n-1, n-k)/k!, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A322127 extends RationalTriangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A322127() {
    super(1);
    hasRAM(true);
  }

  @Override
  protected Q compute(int n, int k) {
    ++n;
    ++k;
    return new Q(Binomial.binomial(n - 1, n - k), FACTORIAL.factorial(k));
  }
}
