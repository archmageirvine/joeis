package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174114.
 * @author Sean A. Irvine
 */
public class A174114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174114() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 8, 11, 23});
  }
}
