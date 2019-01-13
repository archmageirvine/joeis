package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272775.
 * @author Sean A. Irvine
 */
public class A272775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272775() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {121, 6724, 154449, 1860496, 14250625, 78960996, 344362249, 1250895424, 3936182121L, 11035502500L, 28143753121L});
  }
}
