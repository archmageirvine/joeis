package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a033.A033844;

/**
 * A074326 Numbers n such that difference between (1+2^n)-th and (2^n)-th primes is 2.
 * @author Sean A. Irvine
 */
public class A074326 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074326() {
    super(1, 0, new A033844(), n -> n.add(2).isProbablePrime());
  }
}
