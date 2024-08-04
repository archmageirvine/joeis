package irvine.oeis.a071;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071700 Product of twin primes of form (4*k+3,4*(k+1)+1), k&gt;=0.
 * @author Sean A. Irvine
 */
public class A071700 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071700() {
    super(new A071698(), p -> p.add(2).multiply(p));
  }
}
