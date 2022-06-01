package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015087 Inverse of 1078th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015087 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015087() {
    super(Cyclotomic.inverse(1078));
  }
}
