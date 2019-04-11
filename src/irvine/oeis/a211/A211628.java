package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211628 Number of ordered triples (w,x,y) with all terms in <code>{-n,</code>...-1,1,...,n} and 3w+x+y&gt;0.
 * @author Sean A. Irvine
 */
public class A211628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211628() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 4, 30, 105, 249, 487});
  }
}
