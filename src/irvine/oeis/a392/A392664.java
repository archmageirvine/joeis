package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A392664 allocated for Xin Chen.
 * @author Sean A. Irvine
 */
public class A392664 extends ModifiedPascalTriangle {

  /** Construct the sequence. */
  public A392664() {
    super(1);
  }

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(-3 * (n - k) + 1);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(-3 * k + 1);
  }
}
