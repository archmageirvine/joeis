package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014674 Inverse of <code>665th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014674 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014674() {
    super(Cyclotomic.inverse(665));
  }
}
