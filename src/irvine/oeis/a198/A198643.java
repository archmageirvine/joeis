package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198643 <code>5*3^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198643() {
    super(new long[] {-3, 4}, new long[] {4, 14});
  }
}
