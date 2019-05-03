package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014924 Inverse of <code>915th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014924 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014924() {
    super(Cyclotomic.inverse(915));
  }
}
