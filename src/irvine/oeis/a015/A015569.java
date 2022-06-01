package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015569 Inverse of 1560th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015569 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015569() {
    super(Cyclotomic.inverse(1560));
  }
}
