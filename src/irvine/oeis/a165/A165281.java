package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165281.
 * @author Sean A. Irvine
 */
public class A165281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165281() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {251, 232, 243, 224, 475, 2376});
  }
}
