package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081891 A sum of decreasing powers.
 * @author Sean A. Irvine
 */
public class A081891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081891() {
    super(new long[] {30240, -19524, 5000, -635, 40}, new long[] {1, 4, 14, 64, 830});
  }
}
