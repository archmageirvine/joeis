package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198846 <code>9*6^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198846() {
    super(new long[] {-6, 7}, new long[] {8, 53});
  }
}
