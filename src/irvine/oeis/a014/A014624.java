package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014624 Inverse of <code>615th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014624 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014624() {
    super(Cyclotomic.inverse(615));
  }
}
