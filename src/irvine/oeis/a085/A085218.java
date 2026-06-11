package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085218 Factorial expansions of the entries in A085216.
 * @author Sean A. Irvine
 */
public class A085218 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085218() {
    super(0, new A085217(), Functions.FACTORIAL_BASE::z);
  }
}
