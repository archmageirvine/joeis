package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014399 Inverse of <code>390th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014399 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014399() {
    super(Cyclotomic.inverse(390));
  }
}
