package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016289 Inverse of 2280th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016289 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016289() {
    super(Cyclotomic.inverse(2280));
  }
}
