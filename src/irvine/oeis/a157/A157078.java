package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157078 <code>32805000n^2 - 55096200n + 23133601</code>.
 * @author Sean A. Irvine
 */
public class A157078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157078() {
    super(new long[] {1, -3, 3}, new long[] {842401, 44161201, 153090001});
  }
}
