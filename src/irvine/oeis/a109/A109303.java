package irvine.oeis.a109;
// manually 2021-08-15

import irvine.oeis.ComplementSequence;
import irvine.oeis.a010.A010784;

/**
 * A109303 Numbers n with at least one duplicate base-10 digit (A107846(n) &gt; 0).
 * @author Georg Fischer
 */
public class A109303 extends ComplementSequence {

  /** Construct the sequence. */
  public A109303() {
    super(new A010784());
  }

}
