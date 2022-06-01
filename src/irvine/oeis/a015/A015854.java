package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015854 Inverse of 1845th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015854 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015854() {
    super(Cyclotomic.inverse(1845));
  }
}
