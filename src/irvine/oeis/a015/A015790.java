package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015790 Inverse of 1781st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015790 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015790() {
    super(Cyclotomic.inverse(1781));
  }
}
