package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015643 Inverse of 1634th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015643 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015643() {
    super(Cyclotomic.inverse(1634));
  }
}
