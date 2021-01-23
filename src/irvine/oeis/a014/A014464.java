package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014464 Inverse of 455th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014464 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014464() {
    super(Cyclotomic.inverse(455));
  }
}
