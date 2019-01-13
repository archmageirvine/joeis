package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135403.
 * @author Sean A. Irvine
 */
public class A135403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135403() {
    super(new long[] {-1, 2}, new long[] {1, 111111});
  }
}
