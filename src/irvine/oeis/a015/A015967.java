package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015967 Inverse of 1958th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015967 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015967() {
    super(Cyclotomic.inverse(1958));
  }
}
