package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168074.
 * @author Sean A. Irvine
 */
public class A168074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168074() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 4, 7});
  }
}
