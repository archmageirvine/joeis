package irvine.oeis.a075;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075131 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075131() {
    super(1, new A075130(), k -> k.multiply(57));
  }
}
