package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264450.
 * @author Sean A. Irvine
 */
public class A264450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264450() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 3519, 8372, 14805, 23088, 33516});
  }
}
