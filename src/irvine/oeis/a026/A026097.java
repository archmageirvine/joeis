package irvine.oeis.a026;

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005051;

/**
 * A026097 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, |s(i) - s(i-1)| = 1</code> for i <code>= 1,2,3; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 4</code>. Also <code>a(n) =</code> sum of numbers in row <code>n+1</code> of the array T defined in <code>A026082</code> and <code>a(n) = 24*3^(n-4)</code> for <code>n &gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A026097 extends PrependSequence {

  /** Construct the sequence. */
  public A026097() {
    super(new A005051(), 1, 2, 4);
  }
}

