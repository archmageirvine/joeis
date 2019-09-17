package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005323;

/**
 * A026109 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0, s(1) = 1, s(n) = 3, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also <code>a(n) = T(n,n-3)</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026109 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026109() {
    super(new PrependSequence(new A005323(), 0));
  }
}
