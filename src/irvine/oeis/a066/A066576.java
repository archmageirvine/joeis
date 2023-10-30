package irvine.oeis.a066;

import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006862;

/**
 * A066576 Composite Euclid numbers: numbers of the form p# + 1, where p# denotes the primorial of the prime p.
 * @author Sean A. Irvine
 */
public class A066576 extends FilterSequence {

  /** Construct the sequence. */
  public A066576() {
    super(1, new A006862(), k -> !k.isProbablePrime());
  }
}
