package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015599 Inverse of 1590th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015599 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015599() {
    super(Cyclotomic.inverse(1590));
  }
}
