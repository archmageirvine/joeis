package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015777 Inverse of 1768th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015777 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015777() {
    super(Cyclotomic.inverse(1768));
  }
}
