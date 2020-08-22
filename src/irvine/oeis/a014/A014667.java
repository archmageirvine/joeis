package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014667 Inverse of 658th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014667 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014667() {
    super(Cyclotomic.inverse(658));
  }
}
