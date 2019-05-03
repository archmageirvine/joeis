package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015643 Inverse of <code>1634th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015643 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015643() {
    super(Cyclotomic.inverse(1634));
  }
}
