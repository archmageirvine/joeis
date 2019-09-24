package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a102.A102071;

/**
 * A026269 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is a nonnegative integer, <code>s(0) = 0 = s(n), s(1) = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1</code> if <code>s(2) = 1</code>. Also <code>a(n) = T(n,n)</code> and <code>a(n) = Sum{T(k,k-1)}, k = 1,2,...,n</code>, where T is array in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026269 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026269() {
    super(new PrependSequence(new A102071(), 0));
  }
}
