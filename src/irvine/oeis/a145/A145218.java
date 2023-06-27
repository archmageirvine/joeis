package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145218 a(n) is the self-convolution series of the sum of 5th powers of the first n natural numbers.
 * @author Sean A. Irvine
 */
public class A145218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145218() {
    super(1, new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 64, 1510, 17600, 130835, 713216, 3098604, 11320320, 36074325, 102925120, 268038706, 646519744});
  }
}
