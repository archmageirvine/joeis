package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015269 Inverse of 1260th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015269 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015269() {
    super(Cyclotomic.inverse(1260));
  }
}
