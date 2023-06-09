package irvine.oeis.a107;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A107044 A symmetric factorial triangle, read by rows: T(n,k) = min(n,k)!.
 * @author Georg Fischer
 */
public class A107044 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A107044() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return MemoryFactorial.SINGLETON.factorial((n < k) ? n : k);
  }
}
