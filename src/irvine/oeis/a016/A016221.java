package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016221 Inverse of 2212th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016221 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016221() {
    super(Cyclotomic.inverse(2212));
  }
}
