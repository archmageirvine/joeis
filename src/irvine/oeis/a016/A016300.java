package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016300 Inverse of 2291st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016300 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016300() {
    super(Cyclotomic.inverse(2291));
  }
}
