package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014247 Inverse of 238th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014247 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014247() {
    super(Cyclotomic.inverse(238));
  }
}
