package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014737 Inverse of <code>728th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014737 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014737() {
    super(Cyclotomic.inverse(728));
  }
}
