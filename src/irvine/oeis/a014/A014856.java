package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014856 Inverse of <code>847th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014856 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014856() {
    super(Cyclotomic.inverse(847));
  }
}
