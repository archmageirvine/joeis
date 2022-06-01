package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014239 Inverse of 230th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014239 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014239() {
    super(Cyclotomic.inverse(230));
  }
}
