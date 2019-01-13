package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145411.
 * @author Sean A. Irvine
 */
public class A145411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145411() {
    super(new long[] {-288, 516, 145}, new long[] {60, 12000, 1758360});
  }
}
