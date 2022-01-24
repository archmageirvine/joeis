package irvine.oeis.a054;

import irvine.oeis.a020.A020670;

/**
 * A054151 Number of positive integers &lt;= 2^n of form x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054151 extends A054150 {

  /** Construct the sequence. */
  public A054151() {
    super(new A020670());
  }
}
