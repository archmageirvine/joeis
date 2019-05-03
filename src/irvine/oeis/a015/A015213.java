package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015213 Inverse of <code>1204th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015213 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015213() {
    super(Cyclotomic.inverse(1204));
  }
}
