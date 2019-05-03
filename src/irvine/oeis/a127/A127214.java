package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127214 <code>a(n) = 2^n*tribonacci(n)</code> or <code>(2^n)*A001644(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A127214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127214() {
    super(new long[] {8, 4, 2}, new long[] {2, 12, 56});
  }
}
