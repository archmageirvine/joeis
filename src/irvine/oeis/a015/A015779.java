package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015779 Inverse of 1770th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015779 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015779() {
    super(Cyclotomic.inverse(1770));
  }
}
