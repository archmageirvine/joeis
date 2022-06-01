package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015301 Inverse of 1292nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015301 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015301() {
    super(Cyclotomic.inverse(1292));
  }
}
