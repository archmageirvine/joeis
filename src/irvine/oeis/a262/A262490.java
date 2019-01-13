package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262490.
 * @author Sean A. Irvine
 */
public class A262490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262490() {
    super(new long[] {1, -7, 7}, new long[] {9, 57, 337});
  }
}
