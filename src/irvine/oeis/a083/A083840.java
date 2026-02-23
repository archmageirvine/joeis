package irvine.oeis.a083;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A083840 Palindromic primes which are a member of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A083840 extends FilterSequence {

  /** Construct the sequence. */
  public A083840() {
    super(1, new A002385(), p -> p.subtract(2).isProbablePrime() || p.add(2).isProbablePrime());
  }
}
