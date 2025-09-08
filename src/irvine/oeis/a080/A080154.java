package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080154 Values of n corresponding to the terms in sequence A080153.
 * @author Sean A. Irvine
 */
public class A080154 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080154() {
    super(0, new A080153(), Functions.PRIME_PI::z);
  }
}
