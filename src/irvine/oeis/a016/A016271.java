package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016271 Inverse of 2262nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016271 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016271() {
    super(Cyclotomic.inverse(2262));
  }
}
