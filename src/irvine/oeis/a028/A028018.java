package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028018.
 * @author Sean A. Irvine
 */
public class A028018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028018() {
    super(new long[] {-1760, 1436, -336, 31}, new long[] {1, 31, 625, 10395});
  }
}
