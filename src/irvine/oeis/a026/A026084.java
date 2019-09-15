package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024998;

/**
 * A026084 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2,3; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 4, s(n) = 1</code>. Also <code>a(n) = T(n,n-1)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026084 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026084() {
    super(new SkipSequence(new A024998(), 2));
  }
}

