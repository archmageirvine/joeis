package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027812.
 * @author Sean A. Irvine
 */
public class A027812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027812() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {21, 224, 1260, 5040, 16170, 44352, 108108, 240240, 495495});
  }
}
