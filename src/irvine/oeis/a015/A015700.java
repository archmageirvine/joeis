package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015700 Inverse of 1691st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015700 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015700() {
    super(Cyclotomic.inverse(1691));
  }
}
