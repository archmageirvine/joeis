package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a025.A025181;

/**
 * A026070 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 3, s(n) = 3. Also a(n) = T(n,n-3), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026070 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026070() {
    super(3, new PrependSequence(new A025181(), 0));
  }
}

