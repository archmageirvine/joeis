package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212673 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212673() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 0, 8, 46, 152, 378});
  }
}
