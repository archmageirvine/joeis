package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015923 Inverse of <code>1914th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015923 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015923() {
    super(Cyclotomic.inverse(1914));
  }
}
