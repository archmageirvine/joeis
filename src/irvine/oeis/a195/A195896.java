package irvine.oeis.a195;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A195896 Numbers of the form 2*p-1 or 3*p-1 where p is 1 or a prime.
 * @author Georg Fischer
 */
public class A195896 extends UnionSequence {

  /** Construct the sequence. */
  public A195896() {
    super(1, new SimpleTransformSequence(1, new A008578(), t -> t.multiply(2).subtract(1)),
      new SimpleTransformSequence(1, new A008578(), t -> t.multiply(3).subtract(1)));
  }
}
