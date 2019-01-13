package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027480.
 * @author Sean A. Irvine
 */
public class A027480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027480() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 12, 30});
  }
}
