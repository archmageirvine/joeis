package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015075 Inverse of 1066th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015075 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015075() {
    super(Cyclotomic.inverse(1066));
  }
}
