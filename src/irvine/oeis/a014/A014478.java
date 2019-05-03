package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014478 Inverse of <code>469th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014478 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014478() {
    super(Cyclotomic.inverse(469));
  }
}
