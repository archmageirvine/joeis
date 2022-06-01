package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145696 Numbers Y such that 111*Y^2+37 is a square.
 * @author Sean A. Irvine
 */
public class A145696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145696() {
    super(new long[] {-1, 590}, new long[] {7, 4137});
  }
}
