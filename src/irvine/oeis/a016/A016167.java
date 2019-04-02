package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016167 Inverse of 2158th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016167 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016167() {
    super(Cyclotomic.inverse(2158));
  }
}
