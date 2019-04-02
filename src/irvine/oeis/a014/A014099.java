package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014099 Inverse of 90th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014099 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014099() {
    super(Cyclotomic.inverse(90));
  }
}
