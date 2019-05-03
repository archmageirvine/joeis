package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015320 Inverse of <code>1311th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015320 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015320() {
    super(Cyclotomic.inverse(1311));
  }
}
