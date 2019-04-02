package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015970 Inverse of 1961st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015970 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015970() {
    super(Cyclotomic.inverse(1961));
  }
}
