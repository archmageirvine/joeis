package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005324;

/**
 * A026110 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is a nonnegative integer, s(0) = 0, s(1) = 1, s(n) = 4, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n-4), where T is the array defined in A026105.
 * @author Sean A. Irvine
 */
public class A026110 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026110() {
    super(new PrependSequence(new A005324(), 0));
  }
}
