package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014129 Inverse of <code>120th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014129 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014129() {
    super(Cyclotomic.inverse(120));
  }
}
