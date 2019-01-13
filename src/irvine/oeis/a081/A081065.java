package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081065.
 * @author Sean A. Irvine
 */
public class A081065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081065() {
    super(new long[] {1, -15, 15}, new long[] {2, 24, 330});
  }
}
