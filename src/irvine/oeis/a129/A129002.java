package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129002 a(n) = (n^3 + n^2)*2^n.
 * @author Sean A. Irvine
 */
public class A129002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129002() {
    super(new long[] {-16, 32, -24, 8}, new long[] {4, 48, 288, 1280});
  }
}
