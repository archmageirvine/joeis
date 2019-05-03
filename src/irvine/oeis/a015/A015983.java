package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015983 Inverse of <code>1974th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015983 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015983() {
    super(Cyclotomic.inverse(1974));
  }
}
