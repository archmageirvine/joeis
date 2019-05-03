package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015854 Inverse of <code>1845th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015854 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015854() {
    super(Cyclotomic.inverse(1845));
  }
}
