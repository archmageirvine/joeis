package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014256 Inverse of <code>247th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014256 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014256() {
    super(Cyclotomic.inverse(247));
  }
}
