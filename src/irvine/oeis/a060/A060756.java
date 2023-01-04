package irvine.oeis.a060;

import irvine.oeis.InverseSequence;

/**
 * A060756 a(n) is the smallest number for which exactly n primes are bounded between a(n) and 2a(n) exclusively.
 * @author Sean A. Irvine
 */
public class A060756 extends InverseSequence {

  /** Construct the sequence. */
  public A060756() {
    super(new A060715(), 0, 1);
  }
}
