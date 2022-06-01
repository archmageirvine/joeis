package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015522 Inverse of 1513th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015522 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015522() {
    super(Cyclotomic.inverse(1513));
  }
}
