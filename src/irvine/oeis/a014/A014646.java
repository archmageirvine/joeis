package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014646 Inverse of <code>637th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014646 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014646() {
    super(Cyclotomic.inverse(637));
  }
}
