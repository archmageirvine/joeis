package irvine.oeis.a054;

import irvine.oeis.a247.A247881;

/**
 * A054227 Number of positive integers &lt;= 2^n of form x^2 + 13 y^2.
 * @author Sean A. Irvine
 */
public class A054227 extends A054150 {

  /** Construct the sequence. */
  public A054227() {
    super(new A247881());
  }
}
