package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014194 Inverse of <code>185th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014194 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014194() {
    super(Cyclotomic.inverse(185));
  }
}
