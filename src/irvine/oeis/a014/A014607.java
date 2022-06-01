package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014607 Inverse of 598th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014607 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014607() {
    super(Cyclotomic.inverse(598));
  }
}
