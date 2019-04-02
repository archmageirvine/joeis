package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015811 Inverse of 1802nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015811 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015811() {
    super(Cyclotomic.inverse(1802));
  }
}
