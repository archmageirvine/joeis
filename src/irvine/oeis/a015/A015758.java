package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015758 Inverse of 1749th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015758 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015758() {
    super(Cyclotomic.inverse(1749));
  }
}
