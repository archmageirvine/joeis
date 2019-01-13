package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265755.
 * @author Sean A. Irvine
 */
public class A265755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265755() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 0, 1, 1, 0});
  }
}
