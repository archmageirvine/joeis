package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026329 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| &lt;= 1</code> for i <code>= 1,2,...,n, s(0) = 2, s(n) = 6</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array in <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A026329 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026329() {
    super(new A026155());
  }
}
