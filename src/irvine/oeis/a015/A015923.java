package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015923 Inverse of 1914th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015923 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015923() {
    super(Cyclotomic.inverse(1914));
  }
}
