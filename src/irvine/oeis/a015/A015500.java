package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015500 Inverse of 1491st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015500 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015500() {
    super(Cyclotomic.inverse(1491));
  }
}
