package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015304 Inverse of 1295th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015304 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015304() {
    super(Cyclotomic.inverse(1295));
  }
}
