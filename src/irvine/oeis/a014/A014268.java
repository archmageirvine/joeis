package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014268 Inverse of 259th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014268 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014268() {
    super(Cyclotomic.inverse(259));
  }
}
