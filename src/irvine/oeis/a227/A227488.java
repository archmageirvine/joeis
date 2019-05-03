package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227488 The Wiener index of the nanostar dendrimer <code>NSC_5C_6[n]</code>, defined pictorially in the Ashrafi et al. and the Rostami et al. references.
 * @author Sean A. Irvine
 */
public class A227488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227488() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {2192, 75884, 811076, 5876276, 35361428});
  }
}
