package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a025.A025182;

/**
 * A026071 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 3, s(n) = 4. Also a(n) = T(n,n-4), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026071 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026071() {
    super(new PrependSequence(new A025182(), 0));
  }
}

