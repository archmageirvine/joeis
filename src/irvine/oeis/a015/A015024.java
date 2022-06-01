package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015024 Inverse of 1015th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015024 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015024() {
    super(Cyclotomic.inverse(1015));
  }
}
