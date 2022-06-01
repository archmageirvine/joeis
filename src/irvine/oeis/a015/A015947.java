package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015947 Inverse of 1938th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015947 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015947() {
    super(Cyclotomic.inverse(1938));
  }
}
