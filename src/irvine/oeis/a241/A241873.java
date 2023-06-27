package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241873 Number of ascent sequences of length n with exactly three descents.
 * @author Sean A. Irvine
 */
public class A241873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241873() {
    super(6, new long[] {-34560, 196992, -500976, 752672, -745096, 512656, -251663, 88896, -22443, 3952, -461, 32}, new long[] {1, 48, 822, 9305, 83590, 647891, 4537169, 29532566, 182034751, 1076357002, 6162251432L, 34394051095L});
  }
}
