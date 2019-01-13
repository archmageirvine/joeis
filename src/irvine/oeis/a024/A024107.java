package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024107.
 * @author Sean A. Irvine
 */
public class A024107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024107() {
    super(new long[] {-9, 64, -196, 336, -350, 224, -84, 16}, new long[] {1, 8, 17, 0, 2465, 43424, 484785, 4665320});
  }
}
