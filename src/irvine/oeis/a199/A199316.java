package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199316 <code>11*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199316() {
    super(new long[] {-5, 6}, new long[] {12, 56});
  }
}
