package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015406 Inverse of <code>1397th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015406 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015406() {
    super(Cyclotomic.inverse(1397));
  }
}
