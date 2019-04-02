package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015493 Inverse of 1484th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015493 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015493() {
    super(Cyclotomic.inverse(1484));
  }
}
