package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A070562 Fecundity of n.
 * Start with x=n, repeatedly replace x by x + product of digits of x until the product is 0; fecundity = number of steps.
 * a(0) = 0 by convention.
 * @author Georg Fischer
 */
public class A070562 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A070562() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z x = n;
    int steps = 0;
    Z prod = Functions.DIGIT_PRODUCT.z(x);
    while (!prod.isZero()) {
      ++steps;
      x = x.add(prod);
      prod = Functions.DIGIT_PRODUCT.z(x);
    }
    return Z.valueOf(steps);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
