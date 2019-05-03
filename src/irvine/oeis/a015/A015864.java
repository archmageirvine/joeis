package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015864 Inverse of <code>1855th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015864 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015864() {
    super(Cyclotomic.inverse(1855));
  }
}
