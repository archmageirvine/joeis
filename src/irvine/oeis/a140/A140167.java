package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140167.
 * @author Sean A. Irvine
 */
public class A140167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140167() {
    super(new long[] {3, -1}, new long[] {-1, 1});
  }
}
