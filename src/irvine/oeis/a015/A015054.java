package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015054 Inverse of <code>1045th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015054 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015054() {
    super(Cyclotomic.inverse(1045));
  }
}
