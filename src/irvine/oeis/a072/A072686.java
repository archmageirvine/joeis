package irvine.oeis.a072;

import irvine.oeis.FilterSequence;

/**
 * A072686 Prime numbers whose (British) English names have a prime number of letters.
 * @author Sean A. Irvine
 */
public class A072686 extends FilterSequence {

  /** Construct the sequence. */
  public A072686() {
    super(1, new A072685(), PRIME);
  }
}
