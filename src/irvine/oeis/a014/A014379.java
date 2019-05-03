package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014379 Inverse of <code>370th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014379 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014379() {
    super(Cyclotomic.inverse(370));
  }
}
