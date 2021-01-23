package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015406 Inverse of 1397th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015406 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015406() {
    super(Cyclotomic.inverse(1397));
  }
}
