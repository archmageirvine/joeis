package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090992.
 * @author Sean A. Irvine
 */
public class A090992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090992() {
    super(new long[] {-1, -2, 3, 1}, new long[] {7, 13, 24, 45});
  }
}
