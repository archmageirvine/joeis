package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366665 Number of divisors of 9^n+1.
 * @author Sean A. Irvine
 */
public class A366665 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366665() {
    super(0, new A062396(), k -> Functions.SIGMA0.z(k));
  }
}

