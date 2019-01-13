package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134018.
 * @author Sean A. Irvine
 */
public class A134018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134018() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 1, 3, 10});
  }
}
