package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015967 Inverse of <code>1958th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015967 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015967() {
    super(Cyclotomic.inverse(1958));
  }
}
