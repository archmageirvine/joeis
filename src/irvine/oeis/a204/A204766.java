package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204766.
 * @author Sean A. Irvine
 */
public class A204766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204766() {
    super(new long[] {-1, 1, 1}, new long[] {13, 154, 180});
  }
}
