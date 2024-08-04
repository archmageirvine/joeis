package irvine.oeis.a071;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071697 Product of twin primes of form (4*k+1,4*k+3), k&gt;0.
 * @author Sean A. Irvine
 */
public class A071697 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071697() {
    super(new A071695(), p -> p.add(2).multiply(p));
  }
}
