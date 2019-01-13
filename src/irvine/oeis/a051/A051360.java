package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051360.
 * @author Sean A. Irvine
 */
public class A051360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051360() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {0, 0, 0, 16, 389, 3112, 16231, 66177, 228438, 697219, 1932601, 4953493, 11892484, 27003029, 58421782, 121154728});
  }
}
