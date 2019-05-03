package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014366 Inverse of <code>357th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014366 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014366() {
    super(Cyclotomic.inverse(357));
  }
}
