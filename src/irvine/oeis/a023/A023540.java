package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023540 Expansion of 1/((1-x)(1-5x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A023540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023540() {
    super(new long[] {-495, 694, -224, 26}, new long[] {1, 26, 452, 6622});
  }
}
