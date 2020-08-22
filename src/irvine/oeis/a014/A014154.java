package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014154 Inverse of 145th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014154 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014154() {
    super(Cyclotomic.inverse(145));
  }
}
