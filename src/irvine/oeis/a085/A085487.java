package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085487 <code>a(n) =</code> p^n + q^n, p <code>= (1 + sqrt(21))/2</code>, q <code>= (1 - sqrt(21))/2</code>.
 * @author Sean A. Irvine
 */
public class A085487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085487() {
    super(new long[] {5, 1}, new long[] {1, 11});
  }
}
