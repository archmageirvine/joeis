package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015505 Inverse of 1496th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015505 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015505() {
    super(Cyclotomic.inverse(1496));
  }
}
