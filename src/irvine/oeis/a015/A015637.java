package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015637 Inverse of 1628th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015637 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015637() {
    super(Cyclotomic.inverse(1628));
  }
}
