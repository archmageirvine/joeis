package irvine.oeis.a060;

import irvine.oeis.SelfQuotientSequence;

/**
 * A060115 First quotients of A060113.
 * @author Sean A. Irvine
 */
public class A060116 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A060116() {
    super(0, new A060114());
  }
}
