package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014164 Inverse of 155th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014164 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014164() {
    super(Cyclotomic.inverse(155));
  }
}
