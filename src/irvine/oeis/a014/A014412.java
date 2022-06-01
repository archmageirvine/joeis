package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014412 Inverse of 403rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014412 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014412() {
    super(Cyclotomic.inverse(403));
  }
}
