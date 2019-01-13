package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016861.
 * @author Sean A. Irvine
 */
public class A016861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016861() {
    super(new long[] {-1, 2}, new long[] {1, 6});
  }
}
