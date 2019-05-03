package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108104 Sequence <code>A000930</code> with terms repeated.
 * @author Sean A. Irvine
 */
public class A108104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108104() {
    super(new long[] {1, 0, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
