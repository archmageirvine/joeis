package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015075 Inverse of <code>1066th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015075 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015075() {
    super(Cyclotomic.inverse(1066));
  }
}
