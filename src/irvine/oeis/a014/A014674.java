package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014674 Inverse of 665th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014674 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014674() {
    super(Cyclotomic.inverse(665));
  }
}
