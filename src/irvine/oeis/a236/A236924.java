package irvine.oeis.a236;
// Generated by gen_seq4.pl nisolut at 2020-10-28 23:16
// DO NOT EDIT here!

import irvine.oeis.GramMatrixThetaSeries;


/**
 * A236924 Number of integer solutions to a^2 + 2*b^2 + 2*c^2 + 4*d^2 = n.
 * @author Georg Fischer
 */
public class A236924 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A236924() {
    super(new long[][]{{1, 0, 0, 0}, {0, 2, 0, 0}, {0, 0, 2, 0}, {0, 0, 0, 4}});
  }
}
