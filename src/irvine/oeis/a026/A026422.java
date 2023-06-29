package irvine.oeis.a026;

import irvine.oeis.PrependSequence;

/**
 * A026422 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1 &lt;= i &lt;= j &lt; n.
 * @author Sean A. Irvine
 */
public class A026422 extends PrependSequence {

  /** Construct the sequence. */
  public A026422() {
    super(1, new A026424(), 1);
  }
}
