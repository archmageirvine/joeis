package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203408 Numbers which are both heptagonal and decagonal.
 * @author Sean A. Irvine
 */
public class A203408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203408() {
    super(1, new long[] {1, -1, -2079362, 2079362, 1}, new long[] {1, 540, 2887450, 1123674201, 6004054625647L});
  }
}
