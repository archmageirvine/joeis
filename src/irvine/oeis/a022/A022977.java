package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022977 21-n.
 * @author Sean A. Irvine
 */
public class A022977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022977() {
    super(new long[] {-1, 2}, new long[] {21, 20});
  }
}
