package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A392665 allocated for Xin Chen.
 * @author Sean A. Irvine
 */
public class A392665 extends ModifiedPascalTriangle {

  /** Construct the sequence. */
  public A392665() {
    super(1);
  }

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(-4 * (n - k) + 1);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(-4 * k + 1);
  }
}
