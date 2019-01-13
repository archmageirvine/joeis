package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231308.
 * @author Sean A. Irvine
 */
public class A231308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231308() {
    super(new long[] {1, -10, 44, -110, 165, -132, 0, 132, -165, 110, -44, 10}, new long[] {0, 1, 512, 19684, 262656, 1972809, 10340352, 42326416, 144558080, 429746905, 1144558080, 2787694596L});
  }
}
