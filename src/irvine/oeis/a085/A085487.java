package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085487 a(n) = p^n + q^n, p = (1 + sqrt(21))/2, q = (1 - sqrt(21))/2.
 * @author Sean A. Irvine
 */
public class A085487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085487() {
    super(1, new long[] {5, 1}, new long[] {1, 11});
  }
}
