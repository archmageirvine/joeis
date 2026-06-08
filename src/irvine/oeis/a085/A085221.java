package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085221 Factorial expansions of the entries in A085219.
 * @author Sean A. Irvine
 */
public class A085221 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085221() {
    super(1, new A085219(), Functions.FACTORIAL_BASE::z);
  }
}
