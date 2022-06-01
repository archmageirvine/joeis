package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015351 Inverse of 1342nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015351 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015351() {
    super(Cyclotomic.inverse(1342));
  }
}
