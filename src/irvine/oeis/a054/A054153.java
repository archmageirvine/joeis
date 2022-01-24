package irvine.oeis.a054;

import irvine.oeis.a020.A020672;

/**
 * A054153 Number of positive integers &lt;= 2^n of form x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A054153 extends A054150 {

  /** Construct the sequence. */
  public A054153() {
    super(new A020672());
  }
}
