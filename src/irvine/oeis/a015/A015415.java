package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015415 Inverse of 1406th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015415 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015415() {
    super(Cyclotomic.inverse(1406));
  }
}
