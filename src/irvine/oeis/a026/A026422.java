package irvine.oeis.a026;

import irvine.oeis.PrependSequence;

/**
 * A026422 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)</code> for <code>1 &lt;= i &lt;= j &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A026422 extends PrependSequence {

  /** Construct the sequence. */
  public A026422() {
    super(new A026424(), 1);
  }
}
