package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014350 Inverse of 341st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014350 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014350() {
    super(Cyclotomic.inverse(341));
  }
}
