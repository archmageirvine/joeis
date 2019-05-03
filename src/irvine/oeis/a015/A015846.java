package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015846 Inverse of <code>1837th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015846 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015846() {
    super(Cyclotomic.inverse(1837));
  }
}
