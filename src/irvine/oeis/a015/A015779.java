package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015779 Inverse of <code>1770th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015779 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015779() {
    super(Cyclotomic.inverse(1770));
  }
}
