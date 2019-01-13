package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134168.
 * @author Sean A. Irvine
 */
public class A134168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134168() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 9, 30});
  }
}
