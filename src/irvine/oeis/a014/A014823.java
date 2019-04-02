package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014823 Inverse of 814th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014823 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014823() {
    super(Cyclotomic.inverse(814));
  }
}
