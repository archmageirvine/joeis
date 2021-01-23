package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014299 Inverse of 290th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014299 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014299() {
    super(Cyclotomic.inverse(290));
  }
}
