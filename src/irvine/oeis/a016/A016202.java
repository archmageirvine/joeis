package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016202 Inverse of 2193rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016202 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016202() {
    super(Cyclotomic.inverse(2193));
  }
}
