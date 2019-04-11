package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056487 <code>a(n) = 5^(n/2)</code> for n even, <code>a(n) = 3*5^((n-1)/2)</code> for n odd.
 * @author Sean A. Irvine
 */
public class A056487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056487() {
    super(new long[] {5, 0}, new long[] {1, 3});
  }
}
