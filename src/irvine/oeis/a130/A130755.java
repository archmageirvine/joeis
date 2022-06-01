package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130755 Binomial transform of periodic sequence (3, 1, 2).
 * @author Sean A. Irvine
 */
public class A130755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130755() {
    super(new long[] {2, -3, 3}, new long[] {3, 4, 7});
  }
}
