package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026087 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2,3; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 4, s(n) = 4</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026087 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026087() {
    super(new PrependSequence(new A026071(), 0));
  }
}

