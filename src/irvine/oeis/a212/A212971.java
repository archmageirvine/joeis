package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212971 Number of triples (w,x,y) with all terms in {0,...,n} and w &lt; floor((x+y)/3).
 * @author Sean A. Irvine
 */
public class A212971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212971() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 3, 11, 25, 48});
  }
}
