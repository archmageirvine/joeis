package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014366 Inverse of 357th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014366 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014366() {
    super(Cyclotomic.inverse(357));
  }
}
