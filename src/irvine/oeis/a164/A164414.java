package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164414.
 * @author Sean A. Irvine
 */
public class A164414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164414() {
    super(new long[] {2, 0, 1}, new long[] {13, 22, 37});
  }
}
