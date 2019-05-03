package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015493 Inverse of <code>1484th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015493 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015493() {
    super(Cyclotomic.inverse(1484));
  }
}
