package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015760 Inverse of 1751st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015760 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015760() {
    super(Cyclotomic.inverse(1751));
  }
}
