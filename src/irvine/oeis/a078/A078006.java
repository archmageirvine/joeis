package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078006.
 * @author Sean A. Irvine
 */
public class A078006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078006() {
    super(new long[] {2, 2, 1}, new long[] {1, 0, 2});
  }
}
