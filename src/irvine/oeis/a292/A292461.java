package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A292461 Expansion of (1 - x - x^2 + sqrt((1 - x - x^2)^2 - 4*x^3))/2 in powers of x.
 * @author Georg Fischer
 */
public class A292461 extends PrependSequence {

  /** Construct the sequence. */
  public A292461() {
    super(0, new A292460(), -1, 1, 1);
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
