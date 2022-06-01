package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015563 Inverse of 1554th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015563 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015563() {
    super(Cyclotomic.inverse(1554));
  }
}
