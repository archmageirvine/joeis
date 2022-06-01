package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015688 Inverse of 1679th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015688 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015688() {
    super(Cyclotomic.inverse(1679));
  }
}
