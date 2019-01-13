package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239610.
 * @author Sean A. Irvine
 */
public class A239610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239610() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 131044, 11309769, 228735376, 2258625625L, 14430255876L, 68689595569L, 264286471744L, 865363202001L, 2496558002500L});
  }
}
