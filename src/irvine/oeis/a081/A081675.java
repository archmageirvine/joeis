package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081675.
 * @author Sean A. Irvine
 */
public class A081675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081675() {
    super(new long[] {40, -38, 11}, new long[] {0, 1, 8});
  }
}
