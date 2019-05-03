package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015439 Inverse of <code>1430th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015439 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015439() {
    super(Cyclotomic.inverse(1430));
  }
}
