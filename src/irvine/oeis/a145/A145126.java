package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145126.
 * @author Sean A. Irvine
 */
public class A145126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145126() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 6, 16, 36});
  }
}
