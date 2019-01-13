package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264444.
 * @author Sean A. Irvine
 */
public class A264444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264444() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 20, 48, 85});
  }
}
