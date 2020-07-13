package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033703 Number of polygonal numbers which are repdigits with <code>&lt;= n</code> digits.
 * @author Sean A. Irvine
 */
public class A033703 extends PartialSumSequence {

  /** Construct the sequence. */
  public A033703() {
    super(new A033702());
  }
}
