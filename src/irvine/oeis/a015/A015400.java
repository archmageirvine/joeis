package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015400 Inverse of 1391st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015400 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015400() {
    super(Cyclotomic.inverse(1391));
  }
}
