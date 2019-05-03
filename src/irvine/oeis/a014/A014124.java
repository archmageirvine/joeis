package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014124 Inverse of <code>115th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014124 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014124() {
    super(Cyclotomic.inverse(115));
  }
}
