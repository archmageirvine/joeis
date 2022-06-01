package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099254 Self-convolution of A010892. The g.f. is 1/(Alexander polynomial of granny knot).
 * @author Sean A. Irvine
 */
public class A099254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099254() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 2, 1, -2});
  }
}
