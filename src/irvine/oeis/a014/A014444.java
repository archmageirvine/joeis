package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014444 Inverse of <code>435th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014444 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014444() {
    super(Cyclotomic.inverse(435));
  }
}
