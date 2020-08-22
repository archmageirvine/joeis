package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095932 Number of walks of length 2n+1 between two nodes at distance 3 in the cycle graph C_10.
 * @author Sean A. Irvine
 */
public class A095932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095932() {
    super(new long[] {4, -13, 7}, new long[] {1, 5, 22});
  }
}
