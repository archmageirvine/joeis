package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014737 Inverse of 728th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014737 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014737() {
    super(Cyclotomic.inverse(728));
  }
}
