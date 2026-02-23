package irvine.oeis.a083;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A083842 Palindromic primes p such that p-2 is also a prime: members of A083840 which are the larger member of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A083842 extends FilterSequence {

  /** Construct the sequence. */
  public A083842() {
    super(1, new A002385(), p -> p.subtract(2).isProbablePrime());
  }
}
