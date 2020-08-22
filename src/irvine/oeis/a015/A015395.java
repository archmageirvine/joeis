package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015395 Inverse of 1386th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015395 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015395() {
    super(Cyclotomic.inverse(1386));
  }
}
