package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a025.A025180;

/**
 * A026069 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 3, s(n) = 2</code>. Also <code>a(n) = T(n,n-2)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026069 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026069() {
    super(new A025180());
  }
}

