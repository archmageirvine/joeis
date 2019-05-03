package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059506 Transform of <code>A059502</code> applied to sequence 3,4,5,...
 * @author Sean A. Irvine
 */
public class A059506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059506() {
    super(new long[] {-1, 6, -11, 6}, new long[] {3, 7, 19, 53});
  }
}
