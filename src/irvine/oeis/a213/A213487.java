package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213487 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and |w-x|+|x-y|+|y-w| <code>&lt;=</code> w+x+y.
 * @author Sean A. Irvine
 */
public class A213487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213487() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {1, 5, 15, 37, 77, 138});
  }
}
