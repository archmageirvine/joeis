package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015879 Inverse of 1870th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015879 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015879() {
    super(Cyclotomic.inverse(1870));
  }
}
