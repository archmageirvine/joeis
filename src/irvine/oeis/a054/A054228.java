package irvine.oeis.a054;

import irvine.oeis.a244.A244037;

/**
 * A054228 Number of positive integers &lt;= 2^n of form x^2 + 14 y^2.
 * @author Sean A. Irvine
 */
public class A054228 extends A054150 {

  /** Construct the sequence. */
  public A054228() {
    super(new A244037());
  }
}
