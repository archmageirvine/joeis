package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291011.
 * @author Sean A. Irvine
 */
public class A291011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291011() {
    super(new long[] {12, -16, 7}, new long[] {4, 15, 52});
  }
}
