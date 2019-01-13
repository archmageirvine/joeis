package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145336.
 * @author Sean A. Irvine
 */
public class A145336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145336() {
    super(new long[] {1, -33711, 33711}, new long[] {26, 893341, 30114541938L});
  }
}
