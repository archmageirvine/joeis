package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198849 <code>a(n) = (11*6^n - 1)/5</code>.
 * @author Sean A. Irvine
 */
public class A198849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198849() {
    super(new long[] {-6, 7}, new long[] {2, 13});
  }
}
