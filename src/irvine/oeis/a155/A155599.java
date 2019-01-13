package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155599.
 * @author Sean A. Irvine
 */
public class A155599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155599() {
    super(new long[] {16, -26, 11}, new long[] {1, 7, 61});
  }
}
