package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085222 Factorial expansions of the entries in A085220.
 * @author Sean A. Irvine
 */
public class A085222 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085222() {
    super(1, new A085220(), Functions.FACTORIAL_BASE::z);
  }
}
