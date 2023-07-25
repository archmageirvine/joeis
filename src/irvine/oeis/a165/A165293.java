package irvine.oeis.a165;
// manually inverse at 2023-07-24 10:20

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A165293 Inverse of A038303, and generalization of A130595.
 * @author Georg Fischer
 */
public class A165293 extends BaseTriangle {

  /** Construct the sequence. */
  public A165293() {
    super(1, 0, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // A038303 = Triangle whose (i,j)-th entry is binomial(i,j)*10^(i-j)*1^j.
    return Binomial.binomial(n, k).multiply(Z.TEN.pow(n - k)).multiply(((k & 1) == 0) ? 1 : -1);
  }
}
