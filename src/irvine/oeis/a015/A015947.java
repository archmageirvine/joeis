package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015947 Inverse of <code>1938th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015947 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015947() {
    super(Cyclotomic.inverse(1938));
  }
}
