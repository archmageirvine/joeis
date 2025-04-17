package irvine.oeis.a076;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A076805 Triskaidekaphobic or 13-free primes: primes that do not contain the number 13.
 * @author Sean A. Irvine
 */
public class A076805 extends FilterSequence {

  /** Construct the sequence. */
  public A076805() {
    super(1, new A000040(), p -> !p.toString().contains("13"));
  }
}

