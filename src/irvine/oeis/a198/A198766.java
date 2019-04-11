package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198766 <code>(7*5^n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A198766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198766() {
    super(new long[] {-5, 6}, new long[] {3, 17});
  }
}
