package irvine.oeis.a372;

import irvine.oeis.FilterSequence;
import irvine.oeis.a284.A284798;

/**
 * A372770 Primes in A284798.
 * @author Sean A. Irvine
 */
public class A372770 extends FilterSequence {

  /** Construct the sequence. */
  public A372770() {
    super(1, new A284798(), PRIME);
  }
}
