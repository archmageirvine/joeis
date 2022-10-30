package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033703 Number of polygonal numbers which are repdigits with &lt;= n digits.
 * @author Sean A. Irvine
 */
public class A033703 extends PartialSumSequence {

  /** Construct the sequence. */
  public A033703() {
    super(1, new A033702());
  }
}
