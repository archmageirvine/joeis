package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014354 Inverse of 345th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014354 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014354() {
    super(Cyclotomic.inverse(345));
  }
}
