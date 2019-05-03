package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015114 Inverse of <code>1105th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015114 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015114() {
    super(Cyclotomic.inverse(1105));
  }
}
