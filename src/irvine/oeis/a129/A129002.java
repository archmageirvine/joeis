package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129002 <code>(n^3+n^2)*2^n</code>.
 * @author Sean A. Irvine
 */
public class A129002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129002() {
    super(new long[] {-16, 32, -24, 8}, new long[] {4, 48, 288, 1280});
  }
}
