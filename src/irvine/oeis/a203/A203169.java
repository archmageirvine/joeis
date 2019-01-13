package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203169.
 * @author Sean A. Irvine
 */
public class A203169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203169() {
    super(new long[] {-1, 56, -440, 770, -440, 56}, new long[] {0, 1, 82, 4178, 198659, 9349284});
  }
}
