package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016128 Inverse of 2119th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016128 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016128() {
    super(Cyclotomic.inverse(2119));
  }
}
