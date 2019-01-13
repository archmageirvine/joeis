package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291911.
 * @author Sean A. Irvine
 */
public class A291911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291911() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 36, 3456, 77040, 800640, 5265540, 25514496, 99320256, 327836160, 951285060});
  }
}
