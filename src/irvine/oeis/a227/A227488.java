package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227488 The Wiener index of the nanostar dendrimer NSC_5C_6[n], defined pictorially in the Ashrafi et al. and the Rostami et al. references.
 * @author Sean A. Irvine
 */
public class A227488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227488() {
    super(1, new long[] {64, -160, 148, -64, 13}, new long[] {2192, 75884, 811076, 5876276, 35361428});
  }
}
