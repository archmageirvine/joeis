package irvine.oeis.a049;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a031.A031443;

/**
 * A049362 Digitally balanced numbers in bases 2, 3 and 4.
 * @author Sean A. Irvine
 */
public class A049362 extends IntersectionSequence {

  /** Construct the sequence. */
  public A049362() {
    super(new A031443(), new A049354(), new A049355());
  }
}
