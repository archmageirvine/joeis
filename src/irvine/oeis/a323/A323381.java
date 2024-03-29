package irvine.oeis.a323;
// Generated by gen_seq4.pl nisolut at 2020-10-29 20:36
// DO NOT EDIT here!

import irvine.oeis.GramMatrixThetaSeries;


/**
 * A323381 Number of solutions to n = x^2 + 2*y^2 + 5*z^2 + x*z in integers.
 * @author Georg Fischer
 */
public class A323381 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A323381() {
    super(new long[][]{{1, 0, 1}, {0, 2, 0}, {0, 0, 5}});
  }
}
