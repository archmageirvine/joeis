package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014128 Inverse of 119th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014128 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014128() {
    super(Cyclotomic.inverse(119));
  }
}
