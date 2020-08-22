package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140107 a(n) = binomial(n+3, 3)*7^n.
 * @author Sean A. Irvine
 */
public class A140107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140107() {
    super(new long[] {-2401, 1372, -294, 28}, new long[] {1, 28, 490, 6860});
  }
}
