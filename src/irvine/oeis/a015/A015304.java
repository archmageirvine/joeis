package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015304 Inverse of <code>1295th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015304 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015304() {
    super(Cyclotomic.inverse(1295));
  }
}
