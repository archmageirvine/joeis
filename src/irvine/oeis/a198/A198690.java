package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198690 <code>9*7^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198690() {
    super(new long[] {-7, 8}, new long[] {8, 62});
  }
}
