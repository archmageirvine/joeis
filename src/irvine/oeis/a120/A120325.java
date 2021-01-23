package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120325 Period 6: repeat [0, 0, 1, 0, 1, 0].
 * @author Sean A. Irvine
 */
public class A120325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120325() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 0, 1, 0, 1, 0});
  }
}
