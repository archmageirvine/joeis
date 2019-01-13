package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167993.
 * @author Sean A. Irvine
 */
public class A167993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167993() {
    super(new long[] {-9, 3, 3}, new long[] {0, 0, 1});
  }
}
