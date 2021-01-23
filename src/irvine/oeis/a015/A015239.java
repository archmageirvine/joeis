package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015239 Inverse of 1230th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015239 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015239() {
    super(Cyclotomic.inverse(1230));
  }
}
