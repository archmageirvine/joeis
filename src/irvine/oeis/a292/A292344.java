package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292344.
 * @author Sean A. Irvine
 */
public class A292344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292344() {
    super(new long[] {1, -3, 3}, new long[] {68, 212, 420});
  }
}
