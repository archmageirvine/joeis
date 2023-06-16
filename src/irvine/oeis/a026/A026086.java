package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026086 Number of (s(0), s(1), ..., s(n)) such that s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2,3; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 4, s(n) = 3; also a(n) = T(n,n-3), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026086 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026086() {
    super(4, new A026070());
  }
}

