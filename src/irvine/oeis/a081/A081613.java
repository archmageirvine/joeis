package irvine.oeis.a081;

import irvine.oeis.a000.A000142;
import irvine.oeis.a008.A008908;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A081613 Length of iteration list when Collatz-function is iterated with initial value n!=A000142[n].
 * @author Georg Fischer
 */
public class A081613 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A081613() {
    super(0, new A008908(), new A000142());
  }
}
