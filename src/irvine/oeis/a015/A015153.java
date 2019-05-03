package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015153 Inverse of <code>1144th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015153 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015153() {
    super(Cyclotomic.inverse(1144));
  }
}
