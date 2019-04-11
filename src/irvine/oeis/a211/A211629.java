package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211629 Number of ordered triples (w,x,y) with all terms in <code>{-n, </code>..., <code>-1, 1, </code>..., <code>n}</code> and 4w <code>+ x +</code> y <code>&gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A211629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211629() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {0, 4, 31, 105, 252, 492, 851});
  }
}
