package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026124 a(n) = number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, s(n) = 3, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n-2), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026124 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026124() {
    super(new PrependSequence(new A026109(), 0));
  }
}
