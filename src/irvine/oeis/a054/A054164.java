package irvine.oeis.a054;

import irvine.oeis.a020.A020679;

/**
 * A054164 Number of positive integers &lt;= 2^n of form 3 x^2 + 7 y^2.
 * @author Sean A. Irvine
 */
public class A054164 extends A054150 {

  /** Construct the sequence. */
  public A054164() {
    super(new A020679());
  }
}
