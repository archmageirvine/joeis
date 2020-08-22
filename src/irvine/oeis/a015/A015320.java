package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015320 Inverse of 1311th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015320 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015320() {
    super(Cyclotomic.inverse(1311));
  }
}
