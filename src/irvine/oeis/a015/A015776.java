package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015776 Inverse of <code>1767th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015776 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015776() {
    super(Cyclotomic.inverse(1767));
  }
}
