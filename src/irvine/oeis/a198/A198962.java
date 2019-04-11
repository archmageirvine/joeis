package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198962 <code>5*9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198962() {
    super(new long[] {-9, 10}, new long[] {4, 44});
  }
}
