package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015794 Inverse of <code>1785th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015794 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015794() {
    super(Cyclotomic.inverse(1785));
  }
}
