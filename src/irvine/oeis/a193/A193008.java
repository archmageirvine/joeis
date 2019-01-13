package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193008.
 * @author Sean A. Irvine
 */
public class A193008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193008() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 2, 10, 31, 78});
  }
}
