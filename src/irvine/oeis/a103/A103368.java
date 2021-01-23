package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103368 Period 6: repeat [1, 1, -1, -1, 0, 0].
 * @author Sean A. Irvine
 */
public class A103368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103368() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, 1, -1, -1});
  }
}
