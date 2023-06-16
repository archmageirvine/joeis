package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005325;

/**
 * A026126 a(n) = number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, s(n) = 5, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n-4), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026126 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026126() {
    super(4, new PrependSequence(new DifferenceSequence(new PrependSequence(new A005325(), 0)), 0));
  }
}
