package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237255.
 * @author Sean A. Irvine
 */
public class A237255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237255() {
    super(new long[] {-1, 0, 5, 0}, new long[] {2, 3, 7, 13});
  }
}
