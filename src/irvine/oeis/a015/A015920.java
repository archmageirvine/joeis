package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015920 Inverse of <code>1911th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015920 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015920() {
    super(Cyclotomic.inverse(1911));
  }
}
