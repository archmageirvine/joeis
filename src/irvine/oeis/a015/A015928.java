package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015928 Inverse of <code>1919th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015928 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015928() {
    super(Cyclotomic.inverse(1919));
  }
}
