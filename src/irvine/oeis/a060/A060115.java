package irvine.oeis.a060;

import irvine.oeis.SelfQuotientSequence;

/**
 * A060115 First quotients of A060113.
 * @author Sean A. Irvine
 */
public class A060115 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A060115() {
    super(new A060113());
  }
}
