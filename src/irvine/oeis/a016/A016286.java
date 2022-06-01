package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016286 Inverse of 2277th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016286 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016286() {
    super(Cyclotomic.inverse(2277));
  }
}
