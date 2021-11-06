package irvine.oeis.a052;

import irvine.oeis.PositionOfNSequence;

/**
 * A052331 Inverse of A052330; A binary encoding of Fermi-Dirac factorization of n, shown in decimal.
 * @author Sean A. Irvine
 */
public class A052331 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A052331() {
    super(new A052330(), 1, 0);
  }
}
