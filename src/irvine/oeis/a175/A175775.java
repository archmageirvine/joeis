package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175775 7*(10^n-3).
 * @author Sean A. Irvine
 */
public class A175775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175775() {
    super(new long[] {-10, 11}, new long[] {49, 679});
  }
}
