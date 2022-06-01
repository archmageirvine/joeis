package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015311 Inverse of 1302nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015311 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015311() {
    super(Cyclotomic.inverse(1302));
  }
}
