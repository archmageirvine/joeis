package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212963 a(n) = number of ordered triples (w,x,y) such that w,x,y are all in {0,...,n} and the numbers |w-x|, |x-y|, |y-w| are distinct.
 * @author Sean A. Irvine
 */
public class A212963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212963() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 0, 12, 36});
  }
}
