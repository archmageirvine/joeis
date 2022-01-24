package irvine.oeis.a054;

import irvine.oeis.a020.A020675;

/**
 * A054157 Number of positive integers &lt;= 2^n of form 2 x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054157 extends A054150 {

  /** Construct the sequence. */
  public A054157() {
    super(new A020675());
  }
}
