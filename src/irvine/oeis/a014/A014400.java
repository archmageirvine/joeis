package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014400 Inverse of 391st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014400 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014400() {
    super(Cyclotomic.inverse(391));
  }
}
