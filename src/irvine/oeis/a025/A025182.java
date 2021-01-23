package irvine.oeis.a025;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014533;

/**
 * A025182 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is an integer, s(0) = 0, |s(1)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, s(n) = 4. Also a(n) = T(n,n-4), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025182 extends DifferenceSequence {

  /** Construct the sequence. */
  public A025182() {
    super(new PrependSequence(new A014533(), 0));
  }
}
