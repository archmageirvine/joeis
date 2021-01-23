package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212692 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212692() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 6, 22, 54});
  }
}
