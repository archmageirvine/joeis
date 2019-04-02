package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014141 Inverse of 132nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014141 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014141() {
    super(Cyclotomic.inverse(132));
  }
}
