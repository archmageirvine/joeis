package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a102.A102071;

/**
 * A026269 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is a nonnegative integer, s(0) = 0 = s(n), s(1) = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1 if s(2) = 1. Also a(n) = T(n,n) and a(n) = Sum{T(k,k-1)}, k = 1,2,...,n, where T is array in A026268.
 * @author Sean A. Irvine
 */
public class A026269 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026269() {
    super(new PrependSequence(new A102071(), 0));
  }
}
