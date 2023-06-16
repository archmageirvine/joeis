package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026125 a(n) = number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, s(n) = 4, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n-3), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026125 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026125() {
    super(3, new PrependSequence(new A026110(), 0));
  }
}
