package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014750 Inverse of 741st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014750 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014750() {
    super(Cyclotomic.inverse(741));
  }
}
