package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014212 Inverse of 203rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014212 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014212() {
    super(Cyclotomic.inverse(203));
  }
}
