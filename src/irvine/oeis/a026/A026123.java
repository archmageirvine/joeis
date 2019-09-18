package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026123 <code>a(n) =</code> number of <code>(s(0),s(1),...,s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 1, s(n) = 2, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also <code>a(n) = T(n,n-1)</code>, where T is the array in <code>A026120; a(n) = U(n,n+1)</code>, where U is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026123 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026123() {
    super(new A026134());
  }
}
