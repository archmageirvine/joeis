package irvine.oeis.a038;

import irvine.oeis.UnionSequence;

/**
 * A038591 Sizes of clusters in hexagonal lattice A_2 with 3-fold symmetry.
 * @author Sean A. Irvine
 */
public class A038591 extends UnionSequence {

  /** Construct the sequence. */
  public A038591() {
    super(new A038588(), new A038590());
  }
}
