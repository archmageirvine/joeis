package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014620 Inverse of 611th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014620 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014620() {
    super(Cyclotomic.inverse(611));
  }
}
