package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015780 Inverse of 1771st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015780 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015780() {
    super(Cyclotomic.inverse(1771));
  }
}
