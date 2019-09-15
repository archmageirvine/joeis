package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026086 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2,3; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 4, s(n) = 3</code>; also <code>a(n) = T(n,n-3)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026086 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026086() {
    super(new A026070());
  }
}

