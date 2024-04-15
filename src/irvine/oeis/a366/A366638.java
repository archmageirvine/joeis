package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a034.A034491;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366638 Sum of the divisors of 7^n+1.
 * @author Sean A. Irvine
 */
public class A366638 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366638() {
    super(0, new A034491(), k -> Functions.SIGMA.z(k));
  }
}

