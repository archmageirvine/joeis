package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131291 Period 9: repeat [5, 4, 5, 3, 4, 3, 5, 4, 5].
 * @author Sean A. Irvine
 */
public class A131291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131291() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {5, 4, 5, 3, 4, 3, 5, 4, 5});
  }
}
