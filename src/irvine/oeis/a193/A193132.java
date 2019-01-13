package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193132.
 * @author Sean A. Irvine
 */
public class A193132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193132() {
    super(new long[] {-256, 32}, new long[] {12, 384});
  }
}
