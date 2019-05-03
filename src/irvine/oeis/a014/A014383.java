package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014383 Inverse of <code>374th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014383 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014383() {
    super(Cyclotomic.inverse(374));
  }
}
