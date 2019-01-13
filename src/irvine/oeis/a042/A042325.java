package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042325.
 * @author Sean A. Irvine
 */
public class A042325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042325() {
    super(new long[] {-1, 0, 210, 0}, new long[] {1, 4, 209, 840});
  }
}
