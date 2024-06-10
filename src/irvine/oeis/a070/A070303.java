package irvine.oeis.a070;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002496;

/**
 * A070303 Primes p such that the equation p^2*x^2==0 (mod p^2+x^2) has no solution.
 * @author Sean A. Irvine
 */
public class A070303 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A070303() {
    super(1, new A000040(), new A002496());
  }
}
