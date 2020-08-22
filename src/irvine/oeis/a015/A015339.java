package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015339 Inverse of 1330th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015339 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015339() {
    super(Cyclotomic.inverse(1330));
  }
}
