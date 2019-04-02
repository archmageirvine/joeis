package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014196 Inverse of 187th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014196 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014196() {
    super(Cyclotomic.inverse(187));
  }
}
