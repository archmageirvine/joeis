package irvine.oeis.a283;
// manually dirtraf at 2024-01-19 19:33

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007097;
import irvine.oeis.a007.A007504;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A283460 Sum of the primes to the n-th primeth recurrence: A007097(n).
 * @author Georg Fischer
 */
public class A283460 extends PrependSequence {

  /** Construct the sequence. */
  public A283460() {
    super(0, new DirectTransformSequence(0, new A007504(), new A007097()), 0);
  }
}
