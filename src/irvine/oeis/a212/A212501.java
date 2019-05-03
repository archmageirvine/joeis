package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212501 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and w <code>&gt; x &lt; y &gt;=</code> z.
 * @author Sean A. Irvine
 */
public class A212501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212501() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 2, 13, 45});
  }
}
