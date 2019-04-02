package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015901 Inverse of 1892nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015901 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015901() {
    super(Cyclotomic.inverse(1892));
  }
}
