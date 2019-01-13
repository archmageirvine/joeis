package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291241.
 * @author Sean A. Irvine
 */
public class A291241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291241() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {1, 2, 3, 7, 10, 22});
  }
}
