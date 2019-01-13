package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253410.
 * @author Sean A. Irvine
 */
public class A253410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253410() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 96, 817, 137712, 1177393});
  }
}
