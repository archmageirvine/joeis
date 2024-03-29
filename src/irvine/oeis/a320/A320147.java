package irvine.oeis.a320;
// Generated by gen_seq4.pl nisolut at 2020-10-28 23:16
// DO NOT EDIT here!

import irvine.oeis.GramMatrixThetaSeries;


/**
 * A320147 Number of integer solutions to a^2 + b^2 + 3*c^2 + 5*d^2 = n.
 * @author Georg Fischer
 */
public class A320147 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A320147() {
    super(new long[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 3, 0}, {0, 0, 0, 5}});
  }
}
