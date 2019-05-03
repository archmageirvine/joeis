package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015549 Inverse of <code>1540th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015549 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015549() {
    super(Cyclotomic.inverse(1540));
  }
}
