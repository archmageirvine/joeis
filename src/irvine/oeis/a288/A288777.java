package irvine.oeis.a288;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A288777 Triangle read by rows in which column k lists the positive multiples of the factorial of k, with 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A288777 extends BaseTriangle {

  /** Construct the sequence. */
  public A288777() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return MemoryFactorial.SINGLETON.factorial(k).multiply(n - k + 1);
  }
}
