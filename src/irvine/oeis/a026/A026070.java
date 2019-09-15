package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a025.A025181;

/**
 * A026070 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 3, s(n) = 3</code>. Also <code>a(n) = T(n,n-3)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026070 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026070() {
    super(new PrependSequence(new A025181(), 0));
  }
}

