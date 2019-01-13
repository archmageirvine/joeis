package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082291.
 * @author Sean A. Irvine
 */
public class A082291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082291() {
    super(new long[] {1, -7, 7}, new long[] {2, 19, 118});
  }
}
