package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015282 Inverse of 1273rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015282 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015282() {
    super(Cyclotomic.inverse(1273));
  }
}
