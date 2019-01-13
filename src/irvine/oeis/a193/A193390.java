package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193390.
 * @author Sean A. Irvine
 */
public class A193390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193390() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 215, 680, 1661, 3446});
  }
}
