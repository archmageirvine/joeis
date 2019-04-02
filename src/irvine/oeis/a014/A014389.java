package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014389 Inverse of 380th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014389 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014389() {
    super(Cyclotomic.inverse(380));
  }
}
