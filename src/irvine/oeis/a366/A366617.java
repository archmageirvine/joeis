package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366617 Sum of the divisors of 5^n+1.
 * @author Sean A. Irvine
 */
public class A366617 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366617() {
    super(0, new A034474(), k -> Functions.SIGMA1.z(k));
  }
}

