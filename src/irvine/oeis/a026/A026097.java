package irvine.oeis.a026;

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005051;

/**
 * A026097 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, |s(i) - s(i-1)| = 1 for i = 1,2,3; |s(i) - s(i-1)| &lt;= 1 for i &gt;= 4. Also a(n) = sum of numbers in row n+1 of the array T defined in A026082 and a(n) = 24*3^(n-4) for n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A026097 extends PrependSequence {

  /** Construct the sequence. */
  public A026097() {
    super(new A005051(), 1, 2, 4);
  }
}

