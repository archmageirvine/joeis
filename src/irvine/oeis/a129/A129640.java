package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129640.
 * @author Sean A. Irvine
 */
public class A129640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129640() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 155, 464, 939, 1764, 3515, 6260});
  }
}
