package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015101 Inverse of 1092nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015101 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015101() {
    super(Cyclotomic.inverse(1092));
  }
}
