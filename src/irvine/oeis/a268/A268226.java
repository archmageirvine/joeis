package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268226.
 * @author Sean A. Irvine
 */
public class A268226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268226() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 5, 6, 8, 11});
  }
}
