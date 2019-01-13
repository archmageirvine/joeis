package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221002.
 * @author Sean A. Irvine
 */
public class A221002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221002() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {21558, 141686, 825078, 4438006, 22578678});
  }
}
