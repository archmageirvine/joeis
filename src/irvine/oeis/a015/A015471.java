package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015471 Inverse of 1462nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015471 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015471() {
    super(Cyclotomic.inverse(1462));
  }
}
