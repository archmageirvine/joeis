package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015934 Inverse of 1925th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015934 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015934() {
    super(Cyclotomic.inverse(1925));
  }
}
