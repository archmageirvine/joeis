package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015983 Inverse of 1974th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015983 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015983() {
    super(Cyclotomic.inverse(1974));
  }
}
