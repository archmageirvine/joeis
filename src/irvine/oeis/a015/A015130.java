package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015130 Inverse of 1121st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015130 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015130() {
    super(Cyclotomic.inverse(1121));
  }
}
