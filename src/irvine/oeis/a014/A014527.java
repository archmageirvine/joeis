package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014527 Inverse of <code>518th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014527 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014527() {
    super(Cyclotomic.inverse(518));
  }
}
