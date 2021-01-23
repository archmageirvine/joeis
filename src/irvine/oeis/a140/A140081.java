package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140081 Period 4: repeat [0, 1, 1, 2].
 * @author Sean A. Irvine
 */
public class A140081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140081() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 1, 2});
  }
}
