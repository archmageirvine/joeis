package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015600 Inverse of 1591st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015600 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015600() {
    super(Cyclotomic.inverse(1591));
  }
}
