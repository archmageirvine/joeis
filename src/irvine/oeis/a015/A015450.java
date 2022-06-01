package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015450 Inverse of 1441st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015450 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015450() {
    super(Cyclotomic.inverse(1441));
  }
}
