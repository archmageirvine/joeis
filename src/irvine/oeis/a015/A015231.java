package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015231 Inverse of 1222nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015231 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015231() {
    super(Cyclotomic.inverse(1222));
  }
}
