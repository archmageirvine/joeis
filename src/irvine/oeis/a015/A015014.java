package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015014 Inverse of 1005th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015014 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015014() {
    super(Cyclotomic.inverse(1005));
  }
}
