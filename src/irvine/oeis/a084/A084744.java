package irvine.oeis.a084;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a085.A085056;

/**
 * A084744 Product of all composite numbers from 1 to the n-th nonprime number divided by product of all the prime divisors of each of those composite numbers which exceed the previously stated value.
 * @author Sean A. Irvine
 */
public class A084744 extends DistinctSequence {

  /** Construct the sequence. */
  public A084744() {
    super(new A085056());
  }
}
