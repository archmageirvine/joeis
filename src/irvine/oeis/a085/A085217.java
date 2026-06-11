package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085217 Factorial expansions of the entries in A085215.
 * @author Sean A. Irvine
 */
public class A085217 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085217() {
    super(0, new A085216(), Functions.FACTORIAL_BASE::z);
  }
}
