package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134064.
 * @author Sean A. Irvine
 */
public class A134064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134064() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 2, 6, 23});
  }
}
