package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015194 Inverse of 1185th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015194 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015194() {
    super(Cyclotomic.inverse(1185));
  }
}
