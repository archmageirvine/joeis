package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014864 Inverse of <code>855th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014864 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014864() {
    super(Cyclotomic.inverse(855));
  }
}
