package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015878 Inverse of <code>1869th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015878 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015878() {
    super(Cyclotomic.inverse(1869));
  }
}
