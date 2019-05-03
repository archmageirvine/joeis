package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014768 Inverse of <code>759th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014768 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014768() {
    super(Cyclotomic.inverse(759));
  }
}
