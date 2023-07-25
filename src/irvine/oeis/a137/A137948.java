package irvine.oeis.a137;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137948 Triangle read by rows, A000012 * A136579.
 * @author Georg Fischer
 */
public class A137948 extends BaseTriangle {

  /** Construct the sequence. */
  public A137948() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return MemoryFactorial.SINGLETON.factorial(k).multiply(n - k + 1);
  }
}
