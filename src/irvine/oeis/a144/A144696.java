package irvine.oeis.a144;
// manually

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A144696 Triangle of 2-Eulerian numbers.
 * @author Georg Fischer
 */
public class A144696 extends ModifiedPascalTriangle {

  /** Construct the sequence. */
  public A144696() {
    super(2);
  }

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(n - k + 2);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(k + 1);
  }
}
