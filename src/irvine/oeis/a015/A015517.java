package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015517 Inverse of <code>1508th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015517 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015517() {
    super(Cyclotomic.inverse(1508));
  }
}
