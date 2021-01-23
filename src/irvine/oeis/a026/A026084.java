package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a024.A024998;

/**
 * A026084 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2,3; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 4, s(n) = 1. Also a(n) = T(n,n-1), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026084 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026084() {
    super(new SkipSequence(new A024998(), 2));
  }
}

