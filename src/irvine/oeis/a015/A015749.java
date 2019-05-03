package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015749 Inverse of <code>1740th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015749 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015749() {
    super(Cyclotomic.inverse(1740));
  }
}
