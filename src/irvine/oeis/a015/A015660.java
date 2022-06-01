package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015660 Inverse of 1651st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015660 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015660() {
    super(Cyclotomic.inverse(1651));
  }
}
