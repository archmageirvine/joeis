package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015358 Inverse of 1349th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015358 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015358() {
    super(Cyclotomic.inverse(1349));
  }
}
