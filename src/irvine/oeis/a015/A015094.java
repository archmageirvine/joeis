package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015094 Inverse of 1085th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015094 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015094() {
    super(Cyclotomic.inverse(1085));
  }
}
