package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015607 Inverse of 1598th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015607 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015607() {
    super(Cyclotomic.inverse(1598));
  }
}
