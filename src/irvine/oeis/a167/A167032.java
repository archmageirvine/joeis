package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167032.
 * @author Sean A. Irvine
 */
public class A167032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167032() {
    super(new long[] {64, -84, 21}, new long[] {1, 21, 358});
  }
}
