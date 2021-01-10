package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a035.A035019;

/**
 * A038590 Sizes of clusters in hexagonal lattice A_2 centered at lattice point.
 * @author Sean A. Irvine
 */
public class A038590 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038590() {
    super(new A035019());
  }
}
