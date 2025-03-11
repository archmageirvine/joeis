package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046328;

/**
 * A075813 Palindromic even numbers with exactly 2 prime factors (counted with multiplicity). Equivalently, palindromic numbers of the form 2*p with p prime.
 * @author Sean A. Irvine
 */
public class A075813 extends FilterSequence {

  /** Construct the sequence. */
  public A075813() {
    super(1, new A046328(), EVEN);
  }
}
