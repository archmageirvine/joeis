package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015299 Inverse of 1290th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015299 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015299() {
    super(Cyclotomic.inverse(1290));
  }
}
