package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015322 Inverse of <code>1313th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015322 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015322() {
    super(Cyclotomic.inverse(1313));
  }
}
