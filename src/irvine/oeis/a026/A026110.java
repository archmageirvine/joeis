package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005324;

/**
 * A026110 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0, s(1) = 1, s(n) = 4, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026110 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026110() {
    super(new PrependSequence(new A005324(), 0));
  }
}
