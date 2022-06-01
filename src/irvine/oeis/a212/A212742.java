package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212742 Number of (w,x,y,z) with all terms in {0,...,n} and max{w,x,y,z}&lt;=2*min{w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212742() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 2, 17, 32, 97, 162, 337, 512});
  }
}
