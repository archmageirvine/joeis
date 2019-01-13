package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018054.
 * @author Sean A. Irvine
 */
public class A018054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018054() {
    super(new long[] {231, -131, 21}, new long[] {1, 21, 310});
  }
}
