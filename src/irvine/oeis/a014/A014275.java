package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014275 Inverse of <code>266th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014275 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014275() {
    super(Cyclotomic.inverse(266));
  }
}
