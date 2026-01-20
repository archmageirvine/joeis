package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083354 Square root of coefficients of power series: A083352(x)^2 + A083352(x) - 1; term-by-term square root of A083353.
 * @author Sean A. Irvine
 */
public class A083354 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083354() {
    super(new A083353(), Z::sqrt);
  }
}
