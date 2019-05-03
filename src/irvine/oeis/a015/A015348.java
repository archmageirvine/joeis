package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015348 Inverse of <code>1339th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015348 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015348() {
    super(Cyclotomic.inverse(1339));
  }
}
