package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014256 Inverse of 247th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014256 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014256() {
    super(Cyclotomic.inverse(247));
  }
}
