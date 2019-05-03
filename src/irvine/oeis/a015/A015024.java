package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015024 Inverse of <code>1015th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015024 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015024() {
    super(Cyclotomic.inverse(1015));
  }
}
