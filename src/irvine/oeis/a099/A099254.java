package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099254 Self-convolution of <code>A010892</code>. The g.f. is <code>1/(Alexander</code> polynomial of granny <code>knot)</code>.
 * @author Sean A. Irvine
 */
public class A099254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099254() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 2, 1, -2});
  }
}
