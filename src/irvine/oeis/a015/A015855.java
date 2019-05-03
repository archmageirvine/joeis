package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015855 Inverse of <code>1846th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015855 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015855() {
    super(Cyclotomic.inverse(1846));
  }
}
