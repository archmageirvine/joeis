package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015944 Inverse of 1935th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015944 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015944() {
    super(Cyclotomic.inverse(1935));
  }
}
