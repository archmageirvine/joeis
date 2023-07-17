package irvine.oeis.a004;

import irvine.oeis.a032.A032428;

/**
 * A004005 Coefficients of elliptic function sn.
 * @author Sean A. Irvine
 */
public class A004005 extends A032428 {

  /** Construct the sequence. */
  public A004005() {
    super(2);
  }

  @Override
  protected int j() {
    return 2;
  }
}
