package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014104 Inverse of <code>95th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014104 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014104() {
    super(Cyclotomic.inverse(95));
  }
}
