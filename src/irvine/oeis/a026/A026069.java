package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a025.A025180;

/**
 * A026069 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 3, s(n) = 2. Also a(n) = T(n,n-2), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026069 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026069() {
    super(new A025180());
  }
}

