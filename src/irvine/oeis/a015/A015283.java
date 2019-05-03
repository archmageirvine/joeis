package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015283 Inverse of <code>1274th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015283 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015283() {
    super(Cyclotomic.inverse(1274));
  }
}
