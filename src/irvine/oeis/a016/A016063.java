package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016063 Inverse of 2054th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016063 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016063() {
    super(Cyclotomic.inverse(2054));
  }
}
