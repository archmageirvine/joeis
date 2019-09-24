package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026270 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0, s(1) = 1 = s(n), |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1</code> if <code>s(2) = 1</code>. Also <code>T(n,n-1)</code>, where T is the array in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026270 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026270() {
    super(new A026269());
  }
}
