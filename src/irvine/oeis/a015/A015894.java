package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015894 Inverse of 1885th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015894 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015894() {
    super(Cyclotomic.inverse(1885));
  }
}
