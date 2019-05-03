package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015299 Inverse of <code>1290th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015299 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015299() {
    super(Cyclotomic.inverse(1290));
  }
}
