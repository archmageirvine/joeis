package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015711 Inverse of 1702nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015711 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015711() {
    super(Cyclotomic.inverse(1702));
  }
}
