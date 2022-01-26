package irvine.oeis.a054;

import irvine.oeis.a243.A243651;

/**
 * A054226 Number of positive integers &lt;= 2^n of form x^2 + 11 y^2.
 * @author Sean A. Irvine
 */
public class A054226 extends A054150 {

  /** Construct the sequence. */
  public A054226() {
    super(new A243651());
  }
}
