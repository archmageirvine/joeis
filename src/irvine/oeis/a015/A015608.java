package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015608 Inverse of 1599th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015608 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015608() {
    super(Cyclotomic.inverse(1599));
  }
}
