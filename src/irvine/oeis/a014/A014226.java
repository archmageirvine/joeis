package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014226 Inverse of <code>217th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014226 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014226() {
    super(Cyclotomic.inverse(217));
  }
}
