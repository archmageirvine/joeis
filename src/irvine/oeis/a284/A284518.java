package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284518.
 * @author Sean A. Irvine
 */
public class A284518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284518() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, 10, 9, 16, 1, 18});
  }
}
