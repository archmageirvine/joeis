package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014821 Inverse of <code>812th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014821 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014821() {
    super(Cyclotomic.inverse(812));
  }
}
