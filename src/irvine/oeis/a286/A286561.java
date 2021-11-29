package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A286561 Square array A(n,k): A(n, 1) = 1, and for k &gt; 1, A(n,k) = the highest exponent e such that k^e divides n,
 * read by descending antidiagonals as A(1, 1), A(1, 2), A(2, 1), etc.
 * @author Georg Fischer
 */
public class A286561 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A286561() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    if (k == 1) {
      return Z.ONE;
    } else {
      long e = 1;
      long pow = k;
      while (n % pow == 0) {
        ++e;
        pow *= k;
      }
      return Z.valueOf(e - 1);
    }
  }
}
