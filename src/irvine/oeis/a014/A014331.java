package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014331 Inverse of 322nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014331 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014331() {
    super(Cyclotomic.inverse(322));
  }
}
