package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014788 Inverse of <code>779th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014788 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014788() {
    super(Cyclotomic.inverse(779));
  }
}
