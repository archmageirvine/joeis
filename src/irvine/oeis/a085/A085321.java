package irvine.oeis.a085;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a003.A003337;

/**
 * A085321 First difference sequence of A003337; i.e., consecutive differences between those consecutive numbers which are sums of three 4th powers.
 * @author Sean A. Irvine
 */
public class A085321 extends DifferenceSequence {

  /** Construct the sequence. */
  public A085321() {
    super(1, new A003337());
  }
}
