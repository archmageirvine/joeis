package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014672 Inverse of 663rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014672 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014672() {
    super(Cyclotomic.inverse(663));
  }
}
