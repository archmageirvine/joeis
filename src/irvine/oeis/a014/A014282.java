package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014282 Inverse of 273rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014282 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014282() {
    super(Cyclotomic.inverse(273));
  }
}
