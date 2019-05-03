package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015494 Inverse of <code>1485th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015494 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015494() {
    super(Cyclotomic.inverse(1485));
  }
}
