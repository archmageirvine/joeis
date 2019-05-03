package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015879 Inverse of <code>1870th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015879 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015879() {
    super(Cyclotomic.inverse(1870));
  }
}
