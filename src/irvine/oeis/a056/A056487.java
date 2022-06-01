package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056487 a(n) = 5^(n/2) for n even, a(n) = 3*5^((n-1)/2) for n odd.
 * @author Sean A. Irvine
 */
public class A056487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056487() {
    super(new long[] {5, 0}, new long[] {1, 3});
  }
}
