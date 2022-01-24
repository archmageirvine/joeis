package irvine.oeis.a054;

import irvine.oeis.a020.A020687;

/**
 * A054178 Number of positive integers &lt;= 2^n of form 5 x^2 + 8 y^2.
 * @author Sean A. Irvine
 */
public class A054178 extends A054150 {

  /** Construct the sequence. */
  public A054178() {
    super(new A020687());
  }
}
