package irvine.oeis.a054;

import irvine.oeis.a020.A020671;

/**
 * A054152 Number of positive integers &lt;= 2^n of form x^2 + 8 y^2.
 * @author Sean A. Irvine
 */
public class A054152 extends A054150 {

  /** Construct the sequence. */
  public A054152() {
    super(new A020671());
  }
}
