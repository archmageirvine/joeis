package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015120 Inverse of <code>1111th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015120 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015120() {
    super(Cyclotomic.inverse(1111));
  }
}
