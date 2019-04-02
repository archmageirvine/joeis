package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015031 Inverse of 1022nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015031 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015031() {
    super(Cyclotomic.inverse(1022));
  }
}
