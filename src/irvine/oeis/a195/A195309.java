package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195309 Row sums of an irregular triangle read by rows in which row n lists the next A026741(n+1) natural numbers A000027.
 * @author Sean A. Irvine
 */
public class A195309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195309() {
    super(1, new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 9, 11, 45, 39, 126, 94, 270});
  }
}
