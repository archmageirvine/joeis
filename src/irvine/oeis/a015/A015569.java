package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015569 Inverse of <code>1560th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015569 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015569() {
    super(Cyclotomic.inverse(1560));
  }
}
