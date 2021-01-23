package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177079 5*(10^n-3).
 * @author Sean A. Irvine
 */
public class A177079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177079() {
    super(new long[] {-10, 11}, new long[] {35, 485});
  }
}
