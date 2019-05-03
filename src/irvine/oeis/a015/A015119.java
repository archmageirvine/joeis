package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015119 Inverse of <code>1110th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015119 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015119() {
    super(Cyclotomic.inverse(1110));
  }
}
