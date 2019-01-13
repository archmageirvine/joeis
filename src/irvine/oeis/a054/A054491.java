package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054491.
 * @author Sean A. Irvine
 */
public class A054491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054491() {
    super(new long[] {-1, 4}, new long[] {1, 6});
  }
}
