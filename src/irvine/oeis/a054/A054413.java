package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054413 <code>a(n) = 7*a(n-1) + a(n-2)</code>, with <code>a(0)=1</code> and <code>a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A054413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054413() {
    super(new long[] {1, 7}, new long[] {1, 7});
  }
}
