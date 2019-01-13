package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164051.
 * @author Sean A. Irvine
 */
public class A164051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164051() {
    super(new long[] {-8, 6}, new long[] {5, 18});
  }
}
