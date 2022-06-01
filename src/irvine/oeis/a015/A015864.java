package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015864 Inverse of 1855th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015864 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015864() {
    super(Cyclotomic.inverse(1855));
  }
}
