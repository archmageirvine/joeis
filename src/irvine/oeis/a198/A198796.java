package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198796 <code>3*6^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198796() {
    super(new long[] {-6, 7}, new long[] {2, 17});
  }
}
