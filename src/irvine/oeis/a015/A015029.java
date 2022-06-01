package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015029 Inverse of 1020th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015029 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015029() {
    super(Cyclotomic.inverse(1020));
  }
}
