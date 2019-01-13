package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089931.
 * @author Sean A. Irvine
 */
public class A089931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089931() {
    super(new long[] {1, 3, 0, 3}, new long[] {1, 3, 9, 30});
  }
}
