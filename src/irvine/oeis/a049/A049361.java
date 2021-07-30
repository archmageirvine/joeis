package irvine.oeis.a049;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a031.A031443;

/**
 * A049361 Digitally balanced numbers in both bases 2 and 3.
 * @author Sean A. Irvine
 */
public class A049361 extends IntersectionSequence {

  /** Construct the sequence. */
  public A049361() {
    super(new A031443(), new A049354());
  }
}
