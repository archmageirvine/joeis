package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015213 Inverse of 1204th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015213 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015213() {
    super(Cyclotomic.inverse(1204));
  }
}
