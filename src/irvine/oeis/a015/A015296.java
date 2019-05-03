package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015296 Inverse of <code>1287th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015296 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015296() {
    super(Cyclotomic.inverse(1287));
  }
}
