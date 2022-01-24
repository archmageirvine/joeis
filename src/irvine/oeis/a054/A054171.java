package irvine.oeis.a054;

import irvine.oeis.a020.A020683;

/**
 * A054171 Number of positive integers &lt;= 2^n of form 4 x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054171 extends A054150 {

  /** Construct the sequence. */
  public A054171() {
    super(new A020683());
  }
}
