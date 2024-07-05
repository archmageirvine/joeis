package irvine.oeis.a071;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;

/**
 * A071198 Impossible primes in A071195. These primes are not terminal primes of shortest consecutive prime sequences initiated with n-th prime and providing prime-sum.
 * @author Sean A. Irvine
 */
public class A071198 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A071198() {
    super(new A000040(), new A071197());
  }
}
