package irvine.oeis.a054;

import irvine.oeis.a243.A243173;

/**
 * A054229 Number of positive integers &lt;= 2^n of form x^2 + 15 y^2.
 * @author Sean A. Irvine
 */
public class A054229 extends A054150 {

  /** Construct the sequence. */
  public A054229() {
    super(new A243173());
  }
}
