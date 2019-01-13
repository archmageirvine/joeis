package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082383.
 * @author Sean A. Irvine
 */
public class A082383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082383() {
    super(new long[] {4, -8, 3, 2}, new long[] {1, 1, 4, 3});
  }
}
