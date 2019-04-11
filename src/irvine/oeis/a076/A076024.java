package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076024 <code>(2^n+4)*(2^n-1)/6</code>.
 * @author Sean A. Irvine
 */
public class A076024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076024() {
    super(new long[] {8, -14, 7}, new long[] {0, 1, 4});
  }
}
