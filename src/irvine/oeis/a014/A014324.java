package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014324 Inverse of 315th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014324 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014324() {
    super(Cyclotomic.inverse(315));
  }
}
