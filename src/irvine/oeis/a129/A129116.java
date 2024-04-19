package irvine.oeis.a129;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A129116 Multifactorial array: A(k,n) = k-tuple factorial of n, for positive n, read by ascending antidiagonals.
 * @author Georg Fischer
 */
public class A129116 extends UpperLeftTriangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A129116() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Functions.MULTIFACTORIAL.z(k, n);
  }
}
