package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014427 Inverse of <code>418th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014427 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014427() {
    super(Cyclotomic.inverse(418));
  }
}
