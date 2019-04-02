package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127216 a(n) = 2^n*tetranacci(n) or (2^n)*A001648(n).
 * @author Sean A. Irvine
 */
public class A127216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127216() {
    super(new long[] {16, 8, 4, 2}, new long[] {2, 12, 56, 240});
  }
}
