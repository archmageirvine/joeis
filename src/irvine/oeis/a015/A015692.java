package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015692 Inverse of 1683rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015692 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015692() {
    super(Cyclotomic.inverse(1683));
  }
}
