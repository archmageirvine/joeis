package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198644 <code>8*3^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198644() {
    super(new long[] {-3, 4}, new long[] {7, 23});
  }
}
