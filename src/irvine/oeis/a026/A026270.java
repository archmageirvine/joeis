package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026270 Number of (s(0), s(1), ..., s(n)) such that every s(i) is a nonnegative integer, s(0) = 0, s(1) = 1 = s(n), |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1 if s(2) = 1. Also T(n,n-1), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026270 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026270() {
    super(2, new A026269());
  }
}
