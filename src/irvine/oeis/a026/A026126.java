package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005325;

/**
 * A026126 <code>a(n) =</code> number of <code>(s(0),s(1),...,s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 1, s(n) = 5, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026126 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026126() {
    super(new PrependSequence(new DifferenceSequence(new PrependSequence(new A005325(), 0)), 0));
  }
}
