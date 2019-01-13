package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290896.
 * @author Sean A. Irvine
 */
public class A290896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290896() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12869, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 16, 136, 816, 3876, 15504, 54264, 170544, 490315});
  }
}
