package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243860.
 * @author Sean A. Irvine
 */
public class A243860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243860() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 4, 7, 12});
  }
}
