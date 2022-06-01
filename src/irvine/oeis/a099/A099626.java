package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099626 A transform of the Pell numbers.
 * @author Sean A. Irvine
 */
public class A099626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099626() {
    super(new long[] {-1, -2, 3, 2}, new long[] {0, 1, 2, 7});
  }
}
