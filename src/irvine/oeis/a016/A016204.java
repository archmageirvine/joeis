package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016204.
 * @author Sean A. Irvine
 */
public class A016204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016204() {
    super(new long[] {18, -29, 12}, new long[] {1, 12, 115});
  }
}
