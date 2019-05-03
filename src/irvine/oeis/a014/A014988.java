package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014988 Inverse of <code>979th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014988 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014988() {
    super(Cyclotomic.inverse(979));
  }
}
