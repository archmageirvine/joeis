package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014834 Inverse of <code>825th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014834 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014834() {
    super(Cyclotomic.inverse(825));
  }
}
