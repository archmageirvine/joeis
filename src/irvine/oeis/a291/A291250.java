package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291250.
 * @author Sean A. Irvine
 */
public class A291250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291250() {
    super(new long[] {1, 1, -5, -4, 5, 1}, new long[] {1, 3, 4, 13, 17, 52});
  }
}
