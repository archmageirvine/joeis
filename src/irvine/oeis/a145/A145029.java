package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145029.
 * @author Sean A. Irvine
 */
public class A145029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145029() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, 2, 3, 4, 5});
  }
}
