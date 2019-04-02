package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144454 First trisection of A061039.
 * @author Sean A. Irvine
 */
public class A144454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144454() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 8, 5, 8, 35, 16, 7, 80, 11, 40, 143, 56, 65, 224, 85, 32, 323, 40, 133, 440, 161, 176, 575, 208, 75, 728});
  }
}
