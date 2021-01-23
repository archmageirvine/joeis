package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015776 Inverse of 1767th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015776 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015776() {
    super(Cyclotomic.inverse(1767));
  }
}
