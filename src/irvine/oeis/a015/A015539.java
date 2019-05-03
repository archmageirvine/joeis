package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015539 Inverse of <code>1530th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015539 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015539() {
    super(Cyclotomic.inverse(1530));
  }
}
