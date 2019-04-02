package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015972 Inverse of 1963rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015972 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015972() {
    super(Cyclotomic.inverse(1963));
  }
}
