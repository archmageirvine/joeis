package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246168 <code>2^n - 10</code>.
 * @author Sean A. Irvine
 */
public class A246168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246168() {
    super(new long[] {-2, 3}, new long[] {-9, -8});
  }
}
