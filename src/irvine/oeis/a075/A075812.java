package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046328;

/**
 * A075812 Palindromic odd numbers with exactly 2 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A075812 extends FilterSequence {

  /** Construct the sequence. */
  public A075812() {
    super(1, new A046328(), ODD);
  }
}
