package irvine.oeis.a076;

import irvine.oeis.SelfQuotientSequence;

/**
 * A076104 Ratios of sums of successive groups in A076105.
 * @author Sean A. Irvine
 */
public class A076104 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A076104() {
    super(new A076103());
  }
}
