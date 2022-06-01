package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015595 Inverse of 1586th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015595 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015595() {
    super(Cyclotomic.inverse(1586));
  }
}
