package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014295 Inverse of 286th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014295 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014295() {
    super(Cyclotomic.inverse(286));
  }
}
