package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198767 <code>8*5^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198767() {
    super(new long[] {-5, 6}, new long[] {7, 39});
  }
}
