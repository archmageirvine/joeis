package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055269.
 * @author Sean A. Irvine
 */
public class A055269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055269() {
    super(new long[] {1, -5, 5}, new long[] {1, 7, 30});
  }
}
