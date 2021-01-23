package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273348 The sum of the semiperimeters of the bargraphs of area n (n&gt;=1).
 * @author Sean A. Irvine
 */
public class A273348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273348() {
    super(new long[] {4, -4, -3, 4}, new long[] {2, 6, 16, 39});
  }
}
