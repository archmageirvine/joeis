package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104249.
 * @author Sean A. Irvine
 */
public class A104249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104249() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 8});
  }
}
