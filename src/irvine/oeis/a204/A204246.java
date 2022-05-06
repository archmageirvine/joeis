package irvine.oeis.a204;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204246 Array given by f(i,1)=1, f(1,j)=1, f(i,i)=(i-1)!, and f(i,j)=0 otherwise, read by antidiagonals.
 * @author Georg Fischer
 */
public class A204246 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A204246() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    if (n == 1 || k == 1) {
      return Z.ONE;
    }
    return n == k ? MemoryFactorial.SINGLETON.factorial(n - 1) : Z.ZERO;
  }
}
