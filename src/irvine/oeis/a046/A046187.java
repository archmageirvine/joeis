package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046187.
 * @author Sean A. Irvine
 */
public class A046187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046187() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 11, 1025, 12507, 1182657});
  }
}
