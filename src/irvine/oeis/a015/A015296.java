package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015296 Inverse of 1287th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015296 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015296() {
    super(Cyclotomic.inverse(1287));
  }
}
