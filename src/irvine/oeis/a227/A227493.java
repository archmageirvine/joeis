package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227493 The hyper-Wiener index of the nanostar dendrimer D_n.
 * @author Sean A. Irvine
 */
public class A227493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227493() {
    super(new long[] {512, -1664, 2208, -1560, 636, -150, 19}, new long[] {42, 14652, 376080, 4717944, 42247752, 311654376, 2030475048});
  }
}
