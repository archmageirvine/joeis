package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014604 Inverse of <code>595th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014604 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014604() {
    super(Cyclotomic.inverse(595));
  }
}
