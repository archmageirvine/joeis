package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015686 Inverse of 1677th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015686 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015686() {
    super(Cyclotomic.inverse(1677));
  }
}
