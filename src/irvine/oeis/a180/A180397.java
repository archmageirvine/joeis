package irvine.oeis.a180;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A180397 T(n,m) = binomial(m!,n).
 * @author Georg Fischer
 */
public class A180397 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A180397() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(Functions.FACTORIAL.z(k), Z.valueOf(n));
  }
}
