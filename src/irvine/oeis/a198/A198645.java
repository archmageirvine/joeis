package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198645 <code>10*3^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198645() {
    super(new long[] {-3, 4}, new long[] {9, 29});
  }
}
