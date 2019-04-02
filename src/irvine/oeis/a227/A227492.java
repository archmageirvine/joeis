package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227492 The Wiener index of the nanostar dendrimer D_n.
 * @author Sean A. Irvine
 */
public class A227492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227492() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {27, 2871, 39663, 326367, 2123199});
  }
}
