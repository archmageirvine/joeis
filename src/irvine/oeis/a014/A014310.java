package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014310 Inverse of 301st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014310 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014310() {
    super(Cyclotomic.inverse(301));
  }
}
