package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a024.A024997;

/**
 * A026083 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0 = s(n), |s(i) - s(i-1)| = 1</code> for i <code>= 1,2,3; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 4</code>. Also <code>a(n) = T(n,n)</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026083 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026083() {
    super(new A024997());
  }
}

