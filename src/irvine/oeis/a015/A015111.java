package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015111 Inverse of 1102nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015111 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015111() {
    super(Cyclotomic.inverse(1102));
  }
}
