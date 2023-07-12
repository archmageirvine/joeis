package irvine.oeis.a144;
// manually

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A144698 Triangle of 4-Eulerian numbers.
 * @author Georg Fischer
 */
public class A144698 extends ModifiedPascalTriangle {

  /** Construct the sequence. */
  public A144698() {
    super(4);
  }

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(n - k + 4);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(k + 1);
  }
}
