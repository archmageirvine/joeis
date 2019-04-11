package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198973 <code>8*10^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198973() {
    super(new long[] {-10, 11}, new long[] {7, 79});
  }
}
