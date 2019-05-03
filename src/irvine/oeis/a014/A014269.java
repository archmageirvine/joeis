package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014269 Inverse of <code>260th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014269 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014269() {
    super(Cyclotomic.inverse(260));
  }
}
