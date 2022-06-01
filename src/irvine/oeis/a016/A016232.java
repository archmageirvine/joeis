package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016232 Inverse of 2223rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016232 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016232() {
    super(Cyclotomic.inverse(2223));
  }
}
