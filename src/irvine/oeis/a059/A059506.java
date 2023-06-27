package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059506 Transform of A059502 applied to sequence 3,4,5,...
 * @author Sean A. Irvine
 */
public class A059506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059506() {
    super(1, new long[] {-1, 6, -11, 6}, new long[] {3, 7, 19, 53});
  }
}
