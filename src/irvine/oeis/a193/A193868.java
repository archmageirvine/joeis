package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193868.
 * @author Sean A. Irvine
 */
public class A193868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193868() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 16, 22, 46});
  }
}
