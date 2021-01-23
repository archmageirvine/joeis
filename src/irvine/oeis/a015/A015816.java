package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015816 Inverse of 1807th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015816 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015816() {
    super(Cyclotomic.inverse(1807));
  }
}
