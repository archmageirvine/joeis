package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015670 Inverse of 1661st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015670 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015670() {
    super(Cyclotomic.inverse(1661));
  }
}
