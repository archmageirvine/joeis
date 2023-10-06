package irvine.oeis.a066;

import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028335;

/**
 * A028335 Number of decimal digits in n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A066227 extends FilterSequence {
  
  /** Construct the sequence. */
  public A066227() {
    super(1, new A028335(), PRIME);
  }
}
