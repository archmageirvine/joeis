package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133252 Partial sums of <code>A006000</code>.
 * @author Sean A. Irvine
 */
public class A133252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133252() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 17, 45, 100});
  }
}
