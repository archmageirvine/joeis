package irvine.oeis.a066;

import irvine.oeis.FilterSequence;

/**
 * A066664 Composite numbers n whose divisors less than or equal to sqrt(n) are consecutive, from 1 up to some number k.
 * @author Sean A. Irvine
 */
public class A066664 extends FilterSequence {

  /** Construct the sequence. */
  public A066664() {
    super(1, new A066522().skip(), k -> !k.isProbablePrime());
  }
}
