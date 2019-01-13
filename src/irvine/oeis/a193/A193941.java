package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193941.
 * @author Sean A. Irvine
 */
public class A193941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193941() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 2, 2, 2});
  }
}
