package irvine.oeis.a059;
// manually trisimple at 2021-11-08

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A059036 In a triangle of numbers (such as that in A059032, A059033, A059034) how many entries lie above position (n,k)? Answer: T(n,k) = (n+1)*(k+1)-1 (n &gt;= 0, k &gt;= 0).
 * T(n, k) = n + k + n*k.
 * @author Georg Fischer
 */
public class A059036 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A059036() {
    super(0, 0, -1);
  }
  
  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + k + n * (long) k);
  }
}
