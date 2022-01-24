package irvine.oeis.a054;

import irvine.oeis.a020.A020693;

/**
 * A054191 Number of positive integers &lt;= 2^n of form 8 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054191 extends A054150 {

  /** Construct the sequence. */
  public A054191() {
    super(new A020693());
  }
}
