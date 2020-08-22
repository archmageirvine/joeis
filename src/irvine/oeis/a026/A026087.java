package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026087 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2,3; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 4, s(n) = 4. Also a(n) = T(n,n-4), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026087 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026087() {
    super(new PrependSequence(new A026071(), 0));
  }
}

