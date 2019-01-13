package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159677.
 * @author Sean A. Irvine
 */
public class A159677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159677() {
    super(new long[] {1, -1023, 1023}, new long[] {0, 0, 64});
  }
}
