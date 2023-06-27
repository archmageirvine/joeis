package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080204 Number of fixed points under n-fold inflation for the substitution rule a-&gt;abc, b-&gt;ab, c-&gt;b that underlies the Kolakoski (3,1) sequence.
 * @author Sean A. Irvine
 */
public class A080204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080204() {
    super(1, new long[] {-1, 1, -2, 3}, new long[] {1, 3, 10, 23});
  }
}
