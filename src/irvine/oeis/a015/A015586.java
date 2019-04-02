package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015586 Inverse of 1577th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015586 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015586() {
    super(Cyclotomic.inverse(1577));
  }
}
