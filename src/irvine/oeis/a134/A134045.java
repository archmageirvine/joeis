package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134045.
 * @author Sean A. Irvine
 */
public class A134045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134045() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 7, 18});
  }
}
