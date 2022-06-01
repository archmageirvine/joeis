package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014776 Inverse of 767th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014776 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014776() {
    super(Cyclotomic.inverse(767));
  }
}
