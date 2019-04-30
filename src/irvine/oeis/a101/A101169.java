package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101169 Lengths of successive words (starting with <code>a)</code> under the substitution: <code>{a -&gt; aab, b -&gt</code>; aac, c <code>-&gt; ab}</code>.
 * @author Sean A. Irvine
 */
public class A101169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101169() {
    super(new long[] {-1, 3, 2}, new long[] {1, 3, 9});
  }
}
