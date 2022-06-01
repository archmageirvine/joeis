package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227708 The Wiener index of the dendrimer D_n defined pictorially in Fig. 1 of the Heydari et al. reference.
 * @author Sean A. Irvine
 */
public class A227708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227708() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {84, 354, 1674, 8178, 39858});
  }
}
