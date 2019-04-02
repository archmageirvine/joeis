package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015813 Inverse of 1804th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015813 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015813() {
    super(Cyclotomic.inverse(1804));
  }
}
