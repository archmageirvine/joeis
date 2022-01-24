package irvine.oeis.a054;

import irvine.oeis.a020.A020689;

/**
 * A054182 Number of positive integers &lt;= 2^n of form 6 x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054182 extends A054150 {

  /** Construct the sequence. */
  public A054182() {
    super(new A020689());
  }
}
