package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014849 Inverse of <code>840th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014849 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014849() {
    super(Cyclotomic.inverse(840));
  }
}
