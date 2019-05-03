package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015807 Inverse of <code>1798th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015807 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015807() {
    super(Cyclotomic.inverse(1798));
  }
}
