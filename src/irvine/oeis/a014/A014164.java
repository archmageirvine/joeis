package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014164 Inverse of <code>155th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014164 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014164() {
    super(Cyclotomic.inverse(155));
  }
}
