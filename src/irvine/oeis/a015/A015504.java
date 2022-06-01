package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015504 Inverse of 1495th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015504 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015504() {
    super(Cyclotomic.inverse(1495));
  }
}
