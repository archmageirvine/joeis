package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016074 Inverse of 2065th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016074 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016074() {
    super(Cyclotomic.inverse(2065));
  }
}
