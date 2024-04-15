package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366666 Sum of the divisors of 9^n+1.
 * @author Sean A. Irvine
 */
public class A366666 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366666() {
    super(0, new A062396(), k -> Functions.SIGMA.z(k));
  }
}

