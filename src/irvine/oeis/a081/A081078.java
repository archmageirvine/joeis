package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081078.
 * @author Sean A. Irvine
 */
public class A081078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081078() {
    super(new long[] {1, -8, 8}, new long[] {4, 44, 319});
  }
}
