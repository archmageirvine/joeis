package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015387 Inverse of <code>1378th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015387 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015387() {
    super(Cyclotomic.inverse(1378));
  }
}
