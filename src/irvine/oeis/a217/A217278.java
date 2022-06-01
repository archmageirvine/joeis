package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217278 Sequences A124174 and A006454 interlaced.
 * @author Sean A. Irvine
 */
public class A217278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217278() {
    super(new long[] {1, 0, -1, 0, -34, 0, 34, 0, 1, 0}, new long[] {0, 0, 1, 3, 10, 15, 45, 120, 351, 528});
  }
}
