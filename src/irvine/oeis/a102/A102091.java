package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102091 Number of perfect matchings in the C_{2n} X P_3 graph (C_{2n} is the cycle graph on 2n vertices and P_3 is the path graph on 3 vertices).
 * @author Sean A. Irvine
 */
public class A102091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102091() {
    super(new long[] {1, -5, 5}, new long[] {12, 32, 108});
  }
}
