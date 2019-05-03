package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014998 Inverse of <code>989th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014998 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014998() {
    super(Cyclotomic.inverse(989));
  }
}
