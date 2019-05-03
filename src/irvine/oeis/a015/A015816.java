package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015816 Inverse of <code>1807th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015816 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015816() {
    super(Cyclotomic.inverse(1807));
  }
}
