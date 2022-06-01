package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015605 Inverse of 1596th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015605 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015605() {
    super(Cyclotomic.inverse(1596));
  }
}
