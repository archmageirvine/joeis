package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198698 <code>3*10^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198698() {
    super(new long[] {-10, 11}, new long[] {2, 29});
  }
}
