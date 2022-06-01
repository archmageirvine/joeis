package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014485 Inverse of 476th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014485 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014485() {
    super(Cyclotomic.inverse(476));
  }
}
