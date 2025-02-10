package irvine.oeis.a075;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075131 Picture-perfect numbers of form 57*p for p in A075130. The decimal reversal is equal to the sum of the reversed proper divisors.
 * @author Sean A. Irvine
 */
public class A075131 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075131() {
    super(1, new A075130(), k -> k.multiply(57));
  }
}
