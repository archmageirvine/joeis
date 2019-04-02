package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074584 Esanacci (hexanacci or "6-anacci") numbers.
 * @author Sean A. Irvine
 */
public class A074584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074584() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {6, 1, 3, 7, 15, 31});
  }
}
