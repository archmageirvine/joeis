package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156227 Period 12: repeat [0,1,3,8,3,1,0,8,6,1,6,8].
 * @author Sean A. Irvine
 */
public class A156227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156227() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 3, 8, 3, 1, 0, 8, 6, 1, 6, 8});
  }
}
