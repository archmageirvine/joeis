package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198972 <code>(7*10^n-1)/3</code>.
 * @author Sean A. Irvine
 */
public class A198972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198972() {
    super(new long[] {-10, 11}, new long[] {2, 23});
  }
}
