package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095307 Number of walks of length n between two nodes at distance 2 in the cycle graph C_7.
 * @author Sean A. Irvine
 */
public class A095307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095307() {
    super(new long[] {-2, -3, 4, 1}, new long[] {1, 0, 4, 1});
  }
}
