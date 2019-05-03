package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127216 <code>a(n) = 2^n*tetranacci(n)</code> or <code>(2^n)*A001648(n)</code>.
 * @author Sean A. Irvine
 */
public class A127216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127216() {
    super(new long[] {16, 8, 4, 2}, new long[] {2, 12, 56, 240});
  }
}
