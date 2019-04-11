package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131874 <code>(7n^2 + 15n + 2) / 2</code>.
 * @author Sean A. Irvine
 */
public class A131874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131874() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 30});
  }
}
