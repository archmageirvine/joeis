package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015054 Inverse of 1045th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015054 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015054() {
    super(Cyclotomic.inverse(1045));
  }
}
