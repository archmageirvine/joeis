package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145530.
 * @author Sean A. Irvine
 */
public class A145530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145530() {
    super(new long[] {1, -1455, 1455}, new long[] {5, 8002, 11635629});
  }
}
