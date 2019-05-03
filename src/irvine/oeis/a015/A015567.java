package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015567 Inverse of <code>1558th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015567 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015567() {
    super(Cyclotomic.inverse(1558));
  }
}
