package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212571 Number of (w,x,y,z) with all terms in {1,...,n} and |w-x|&lt;|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212571() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 8, 48, 168, 428, 916});
  }
}
