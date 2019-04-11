package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140063 Binomial transform of <code>[1, 3, 7, 0, 0, 0, ...]</code>.
 * @author Sean A. Irvine
 */
public class A140063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140063() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 14});
  }
}
