package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014219 Inverse of 210th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014219 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014219() {
    super(Cyclotomic.inverse(210));
  }
}
