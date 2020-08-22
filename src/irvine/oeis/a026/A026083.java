package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a024.A024997;

/**
 * A026083 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0 = s(n), |s(i) - s(i-1)| = 1 for i = 1,2,3; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 4. Also a(n) = T(n,n), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026083 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026083() {
    super(new A024997());
  }
}

