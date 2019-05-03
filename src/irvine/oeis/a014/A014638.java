package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014638 Inverse of <code>629th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014638 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014638() {
    super(Cyclotomic.inverse(629));
  }
}
